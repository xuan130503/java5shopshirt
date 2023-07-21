package com.poly.controller.admin;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.poly.dao.OrderDAO;
import com.poly.entity.Category;
import com.poly.entity.Order;

@Controller
public class orderController {
	@Autowired
	OrderDAO dao;
	
	@RequestMapping("/admin/order/index")
	public String index(Model model) {
		Order item = new Order();
		model.addAttribute("item", item);
		List<Order> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/order/index";
	}

	@RequestMapping("/order/edit/{id}")
	public String edit(Model model, @PathVariable("id") Long id) {
		Order item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<Order> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/order/index";
	}
	
	@RequestMapping("/order/create")
	public String create(Order item) {
		dao.save(item);
		return "redirect:/admin/order/index";
	}
	
	@RequestMapping("/order/update")
	public String update(Order item) {
		try {
			dao.save(item);
		} catch (Exception e) {
		e.getMessage();
		}
		return "redirect:/order/edit/" + item.getId();
	}
	
	@RequestMapping("/order/delete/{id}")
	public String create(@PathVariable("id") Long id) {
		dao.deleteById(id);
		return "redirect:/admin/order/index";
	}
}


