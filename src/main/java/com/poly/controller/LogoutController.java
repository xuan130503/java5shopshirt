package com.poly.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class LogoutController {
	@Autowired
	private HttpSession sess;

	@GetMapping("logout")
	public String index() {
		sess.removeAttribute("CurrentUser");
		return "redirect:/trangchu";
	}
}
