package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.Account;

public interface AccountDAO extends JpaRepository<Account, Integer>{
	public Account findByEmailEquals(String email);
	Account findByUsername(String username);
}
