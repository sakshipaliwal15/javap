package com.renuka.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.renuka.model.AdminLogin;
@Component
public class AdminDaoImpl implements com.renuka.dao.AdminDao
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public String get(String username) {
		try {
			AdminLogin adminLogin = hibernateTemplate.get(AdminLogin.class, username);
			System.out.println(adminLogin.getUsername());
			System.out.println(adminLogin.getPassword());
			return adminLogin.getPassword();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
