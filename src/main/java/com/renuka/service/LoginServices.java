package com.renuka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.renuka.dao.AdminDao;
import com.renuka.service.Patterncheck;
@Component
public class LoginServices 
{

	@Autowired
	private AdminDao adminDao;
	public boolean adminlogin(String username, String password)
	{
if (Patterncheck.checkusername(username) && Patterncheck.checkpassword(password)) {
			
			String str = adminDao.get(username);
			if (str != null) {
				if (str.equals(password)) {
					return true;
				}
			}
		}
		return false;
	}

}
