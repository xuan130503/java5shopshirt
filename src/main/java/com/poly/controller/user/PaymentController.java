package com.poly.controller.user;

import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.dao.OrderDAO;
import com.poly.dao.OrderDetailDAO;
import com.poly.entity.Account;
import com.poly.entity.Order;
import com.poly.entity.OrderDetail;
import com.poly.model.PaymentModel;
import com.poly.services.MailerService;


@Controller
public class PaymentController {
	@Autowired
	OrderDetailDAO ordDao;
	@Autowired
	HttpSession sess;
	@Autowired
	OrderDAO orDao;
	@Autowired
	MailerService mailer;
	
	private Order ord = null;
	
	@GetMapping("/user/payment")
	public String index(@ModelAttribute("payment") PaymentModel payment) {
		return "view/user/payment";
	}
	
	@SuppressWarnings("deprecation")
	@PostMapping("/user/accept")
	public String pay(@Valid @ModelAttribute("payment") PaymentModel payment, BindingResult result) throws MessagingException {
		if(result.hasErrors()) {
			System.out.println("Error");
		} else {
			Account account = (Account) sess.getAttribute("CurrentUser");
			List<OrderDetail> cart = ordDao.getOrderDetails(account.getId());
			for(OrderDetail item : cart) {
				ord = this.orDao.getById(item.getOrder().getId());
				ord.setAddress(payment.getShippingAddress());
				ord.setOrderStatus(1);
				this.orDao.save(ord);
			}
			mailer.send(account.getEmail(), "Elfyer Shop", "Thank you");
		}
		return "redirect:/trangchu";
	}
}
