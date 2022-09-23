package com.renuka.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.renuka.config.Configure;

public class Initializer implements  WebApplicationInitializer
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		AnnotationConfigWebApplicationContext con = new AnnotationConfigWebApplicationContext();
		con.register(Configure.class);
		DispatcherServlet ds = new DispatcherServlet(con);
		ServletRegistration.Dynamic cus = servletContext.addServlet("my", ds);
		cus.setLoadOnStartup(1);
		cus.addMapping("/");
		
	}

}
