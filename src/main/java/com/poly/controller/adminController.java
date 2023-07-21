package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
	
	@RequestMapping("admin/controller")
	public String index() {
		
		
		return"view/admin/index";
	}

}
