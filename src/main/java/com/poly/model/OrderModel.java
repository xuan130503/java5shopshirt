package com.poly.model;

import com.poly.entity.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {

	private int id;
	private String shippingAddress;
	private String orderDate;
	private int orderStatus;
	private Account account;
//	private Set<OrderDetail> orderDetail;
}
