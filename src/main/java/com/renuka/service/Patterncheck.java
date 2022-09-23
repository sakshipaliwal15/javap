package com.renuka.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterncheck 
{
	public static boolean checkusername(String username) {
//		String synt = "^(?![0-9@]$)[A-Za-z0-9]+@[0-9A-Za-z]$";
	//	String synt = "^[A-Z][A-Za-z0-9]+@[A-Za-z0-9]+$";
		String synt="^[A-Za-z]+$";
		Pattern p = Pattern.compile(synt);
		Matcher m = p.matcher(username);
//		System.out.println(m.matches());
		if (m.matches()) {
			return true;
		}

		return false;
	}

	public static boolean checkpassword(String password) {
		//String synt = "^(?=.{8,16}$)(?=.*[A-Z])(?=.*[a-z])[A-Za-z0-9]+@[A-Za-z0-9]+$";
		String synt="^[0-9]+$";
		Pattern p = Pattern.compile(synt);
		Matcher m = p.matcher(password);
//		System.out.println(m.matches());
		if (m.matches()) {
			return true;
		}
		return false;
	}
}
