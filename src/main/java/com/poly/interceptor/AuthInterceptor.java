package com.poly.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.poly.entity.Account;

@Component
public class AuthInterceptor implements HandlerInterceptor {

	@Autowired
	HttpSession sess;
	@Autowired
	HttpServletRequest req;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Account UserLogin = new Account();
		UserLogin = (Account) req.getSession().getAttribute("CurrentUser");
		String error = "";
		if (UserLogin == null) {
			error = "Please login";
			response.sendRedirect("/trangchu/login");
			return false;
		}
		return true;
	}
}
