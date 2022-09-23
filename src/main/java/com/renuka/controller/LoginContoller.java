package com.renuka.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginContoller 
{
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "Login";
	}
   
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String sayhel(@RequestParam("User") String role, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.getRequestDispatcher(role);
		return "redirect:" + role + "/" + role + "?User=" + role;
	}
}
