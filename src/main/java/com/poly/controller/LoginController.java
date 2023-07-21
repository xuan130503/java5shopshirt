package com.poly.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.AccountDAO;
import com.poly.entity.Account;
import com.poly.model.AccountModel;



@Controller
@RequestMapping("trangchu")
public class LoginController {
	@Autowired
	AccountDAO dao;
	@Autowired
	HttpServletRequest req;
	@Autowired
	HttpSession sess;
	@GetMapping("login")
	public String view(@ModelAttribute("acc") AccountModel acc) {
		return "view/user/login";
	}
	
	@PostMapping("login")
	public String login(@ModelAttribute("acc") AccountModel acc,
			@Valid Model model,BindingResult result,
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		if(result.hasErrors()) {
			return "view/user/login";
		} else {
			try {
				Account user = dao.findByUsername(username);
				if (!user.getPassword().equals(password)) {
					model.addAttribute("message", "Invalid password");
				} else {
					sess.setAttribute("CurrentUser",user);
					return "redirect:/trangchu";
				}
			} catch (Exception e) {
				model.addAttribute("message", "Invalid username");
			}
		}
		return "view/user/login";
	}
}
