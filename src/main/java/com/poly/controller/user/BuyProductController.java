package com.poly.controller.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.poly.dao.AccountDAO;
import com.poly.dao.OrderDetailDAO;
import com.poly.entity.Account;
import com.poly.entity.OrderDetail;
import com.poly.entity.Product;

@Controller
public class BuyProductController {
	@Autowired
	AccountDAO accDao;
	@Autowired
	HttpSession sess;
	@Autowired
	OrderDetailDAO ordDao;
	@GetMapping("/user/buy-product/{id}")
	public String chooseItem(Model model, @PathVariable("id") Product product) {
		Account account = (Account) sess.getAttribute("CurrentUser");
		if (account != null) {
			List<OrderDetail> cart = ordDao.getOrderDetails(account.getId());
			sess.setAttribute("countCart", cart.size());
		}
		model.addAttribute("product", product);
		return "view/user/detail";
	}
}
