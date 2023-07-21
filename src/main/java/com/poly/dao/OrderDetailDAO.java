package com.poly.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.poly.entity.OrderDetail;
import com.poly.entity.Report;


public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{
	@Query("SELECT od FROM OrderDetail od " +
		       "JOIN od.order o " +
		       "JOIN od.product p " +
		       "WHERE o.orderStatus = 0 AND o.account.id = ?1")
	List<OrderDetail> getOrderDetails(Integer id);
}