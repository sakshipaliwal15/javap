package com.renuka.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.renuka.model.Doctor_Details;
import com.renuka.service.Patterncheck;
import com.renuka.dao.DoctorDao;

@Component
public class DoctorDataService 
{
  @Autowired
  private DoctorDao doctorDao;
  @Transactional
  public boolean insertDocCheck(Doctor_Details doc) throws Exception {
		System.out.println(doctorDao);
		if (true) 
        {
			int result = doctorDao.insertDoctor(doc);
			System.out.println(result);
			if (result == 1) {
				return true;
			}
		}
		return false;
	}

public List<Doctor_Details> view() throws Exception {
	System.out.println("fgfg");
	List<Doctor_Details> list = doctorDao.view();
	return list;
}
public Doctor_Details singleview(int id) throws Exception {
	if (true) {
		System.out.println("single doc");
		Doctor_Details doc = doctorDao.getdoc(id);
		return doc;
	}
	return null;
}


public Doctor_Details singleview(String userName) throws Exception {
	if (true) {
		Doctor_Details doc = doctorDao.getdoc(userName);
		return doc;
	}
	return null;
}
public boolean updatecheck(Doctor_Details doc) {
	// TODO Auto-generated method stub
	if (true) {
		int result = doctorDao.updateDoctor(doc);
		if (result == 1) {
			return true;
		}
	}
	return false;
}


}
