package com.renuka.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.renuka.service.LoginServices;
@Component
public class LoginInterceptor implements HandlerInterceptor 
{
	@Autowired
	private LoginServices loginServices;
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Prehandle");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(password);
		String role = request.getParameter("User");
		switch (role) {
		case "Admin":
			System.out.println("loginServices");
			if (loginServices.adminlogin(userName, password)) {
				return true;
		}
			break;
		}
		return false;
	}
}
