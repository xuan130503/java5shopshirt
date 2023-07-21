package com.poly.controller.admin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.dao.AccountDAO;
import com.poly.dao.CategoryDAO;
import com.poly.entity.Account;
import com.poly.entity.Category;


@Controller
public class accountController {
	
	@Autowired
	AccountDAO dao;
	
	@RequestMapping("/admin/account/index")
	public String index(Model model) {
		Account item = new Account();
		model.addAttribute("item", item);
		List<Account> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/account/index";
	}

	@RequestMapping("/account/edit/{id}")
	public String edit(Model model, @PathVariable("id") Integer id) {
		Account item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<Account> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/account/index";
	}
	
	@RequestMapping("/account/create")
	public String create(Account item, Model model,@Valid @ModelAttribute("acc")Account acc,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("message", "Some fields are not valid. Please fix them!");
		}
		else {
			model.addAttribute("message", "All fields are valid!");
		}
		dao.save(item);
		return "redirect:/admin/account/index";
	}
	
	@RequestMapping("/account/update")
	public String update(Account item) {
		try {
			dao.save(item);
		} catch (Exception e) {
		e.getMessage();
		}
		return "redirect:/account/edit/" + item.getId();
	}
	
	@RequestMapping("/account/delete/{id}")
	public String create(@PathVariable("id") Integer id) {
		dao.deleteById(id);
		return "redirect:/admin/account/index";
	}
	
}


