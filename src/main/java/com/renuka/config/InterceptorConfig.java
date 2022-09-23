package com.renuka.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.renuka.interceptors.LoginInterceptor;

public class InterceptorConfig 
{
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/login");
	}
}
