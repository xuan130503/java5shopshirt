package com.poly.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.CategoryDAO;
import com.poly.entity.Account;
import com.poly.entity.Category;

@Controller
public class categoryController {
	@Autowired
	CategoryDAO dao;
	
	@RequestMapping("/admin/category/index")
	public String index(Model model) {
		Category item = new Category();
		model.addAttribute("item", item);
		List<Category> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/category/index";
	}

	@RequestMapping("/category/edit/{id}")
	public String edit(Model model, @PathVariable("id") String id) {
		Category item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<Category> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/category/index";
	}
	
	@RequestMapping("/category/create")
	public String create(Category item) {
		dao.save(item);
		return "redirect:/admin/category/index";
	}
	
	@RequestMapping("/category/update")
	public String update(Category item) {
		try {
			dao.save(item);
		} catch (Exception e) {
		e.getMessage();
		}
		return "redirect:/category/edit/" + item.getId();
	}
	
	@RequestMapping("/category/delete/{id}")
	public String create(@PathVariable("id") String id) {
		dao.deleteById(id);
		return "redirect:/admin/category/index";
	}
}


