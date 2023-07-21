package com.poly.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.dao.OrderDetailDAO;
import com.poly.entity.Account;
import com.poly.entity.Category;
import com.poly.entity.OrderDetail;
@Controller
public class orderdetailController {
	@Autowired
	OrderDetailDAO dao;
	
	
	@RequestMapping("/admin/orderdetail/index")
	public String index(Model model) {
		OrderDetail item = new OrderDetail();
		model.addAttribute("item", item);
		List<OrderDetail> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/orderdetail/index";
	}

	@RequestMapping("/orderdetail/edit/{id}")
	public String edit(Model model, @PathVariable("id") Long id) {
		OrderDetail item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<OrderDetail> items = dao.findAll();
		model.addAttribute("items", items);
		return "view/admin/orderdetail/index";
	}
	
	@RequestMapping("/orderdetail/create")
	public String create(OrderDetail item) {
		dao.save(item);
		return "redirect:/admin/orderdetail/index";
	}
	
	@RequestMapping("/orderdetail/update")
	public String update(OrderDetail item) {
		try {
			dao.save(item);
		} catch (Exception e) {
		e.getMessage();
		}
		return "redirect:/orderdetail/edit/" + item.getId();
	}
	
	@RequestMapping("/orderdetail/delete/{id}")
	public String create(@PathVariable("id") Long id) {
		dao.deleteById(id);
		return "redirect:/admin/orderdetail/index";
	}
}

