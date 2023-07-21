package com.poly.controller.admin;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.dao.CategoryDAO;
import com.poly.dao.ProductDAO;
import com.poly.entity.Account;
import com.poly.entity.Category;
import com.poly.entity.Product;

@Controller
public class productController {
	@Autowired
	ProductDAO dao;	

	
	@RequestMapping("/admin/product/index")
	public String index(Model model) {
		Product item = new Product();
		model.addAttribute("item", item);
		List<Product> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/product/index";
	}

	@RequestMapping("/product/edit/{id}")
	public String edit(Model model, @PathVariable("id") Integer id) {
		Product item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<Product> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/product/index";
	}
	
	@RequestMapping("/product/create")
	public String create(Product item) {
		dao.save(item);
		return "redirect:/admin/product/index";
	}
	
	@RequestMapping("/product/update")
	public String update(Product item) {
		try {
			dao.save(item);
		} catch (Exception e) {
		e.getMessage();
		}
		return "redirect:/product/edit/" + item.getId();
	}
	
	@RequestMapping("/product/delete/{id}")
	public String create(@PathVariable("id") Integer id) {
		dao.deleteById(id);
		return "redirect:/admin/product/index";
	}
}
