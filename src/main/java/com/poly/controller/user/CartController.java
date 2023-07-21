package com.poly.controller.user;

import java.time.LocalDate;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.AccountDAO;
import com.poly.dao.OrderDAO;
import com.poly.dao.OrderDetailDAO;
import com.poly.dao.ProductDAO;
import com.poly.entity.Account;
import com.poly.entity.Order;
import com.poly.entity.OrderDetail;
import com.poly.entity.Product;

@Controller
public class CartController {
	@Autowired
	ProductDAO prodDao;
	@Autowired
	OrderDAO orDao;
	@Autowired
	OrderDetailDAO ordDao;
	@Autowired
	AccountDAO	accDao;
	@Autowired
	HttpSession sess;

	@GetMapping("/user/cart")
	public String cart(Model model) {
		Account account = (Account) sess.getAttribute("CurrentUser");
		List<OrderDetail> cart = ordDao.getOrderDetails(account.getId());
		int total = 0;
		int count = 0;
		for(OrderDetail ord : cart) {
			total += ord.getProduct().getPrice() * ord.getQuantity();
			count += ord.getQuantity();
		}
		model.addAttribute("listDetail", cart);
		sess.setAttribute("totalPrice", total);
		sess.setAttribute("countCart", count);
		return "view/user/cart";
	}
	
	@PostMapping("/user/store")
	public String store(@RequestParam(name = "price", defaultValue = "0") double price,
			@RequestParam(name = "product", defaultValue= "product"	) int product,
			@RequestParam(name = "quantity") String quantity) throws MessagingException {
		Product pro = prodDao.findById(product).get();
		Order order = new Order();
		OrderDetail orderDetail = new OrderDetail();
		LocalDate now = LocalDate.now();
		order.setAccount((Account) sess.getAttribute("CurrentUser"));
		order.setCreateDate(now.toString());
		order.setOrderStatus(0);
		this.orDao.save(order);
		orderDetail.setQuantity(Integer.parseInt(quantity));
		orderDetail.setProduct(pro);
		orderDetail.setOrder(order);
		orderDetail.setPrice(price);
		this.ordDao.save(orderDetail);
		return "redirect:/trangchu";
	}
	
	@GetMapping("user/delete/{id}")
	public String delete(@PathVariable("id") Order order) {
		order.setOrderStatus(2);
		this.orDao.save(order);
		return "redirect:/user/cart";
	}
}
