package com.poly.model;


import com.poly.entity.Order;
import com.poly.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailModel {

	private double price;
	private int quantity;
	private Order order;
	private Product product;
}
