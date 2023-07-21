package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.ProductDAO;
import com.poly.entity.Product;

@Controller
public class HomeController {
	@Autowired
	ProductDAO productDao;
	
	@RequestMapping("/trangchu")
	public String view(Model model,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "3") int size) {
		model.addAttribute("page", page);
		Pageable pageable = PageRequest.of(page,size);
		Page<Product> pages = productDao.findAll(pageable);
		model.addAttribute("data", pages);
		return "view/user/index";
	}
	
	// Search theo keyword
	// Search theo giá tiền
	// Liệt kê sản phẩm theo loại
}
