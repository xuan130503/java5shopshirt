package com.poly.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.poly.dao.AccountDAO;
import com.poly.entity.Account;
import com.poly.model.AccountModel;

@Controller
public class RegistryController {
	@Autowired
	AccountDAO accountDao;
	@RequestMapping("/registry")
	public String index(@ModelAttribute("account") AccountModel model) {
		return "/view/user/registry";
	}
	@RequestMapping("/registry/save")
	public String save(@Valid @ModelAttribute("account") AccountModel model, BindingResult result) {
		if(result.hasErrors()) {
			return "/view/user/registry";
		} else {
			Account acc = new Account();
			acc.setUsername(model.getUsername().trim());
			acc.setPassword(model.getPassword().trim());
			acc.setFullname(model.getFullname().trim());
			acc.setEmail(model.getEmail().trim());
			acc.setActivated(true);
			this.accountDao.save(acc);
			return "redirect:/trangchu";
		}
	}
}
