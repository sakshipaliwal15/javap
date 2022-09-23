package com.renuka.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.renuka.dao.DoctorDao;
import com.renuka.model.Doctor_Details;


@Component
public class DoctorDaoImpl  implements DoctorDao
{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional(readOnly = false)
	public int insertDoctor(Doctor_Details doc) 
	{
		int save = 0;
		try {
			System.out.println("hyy");
			hibernateTemplate.setCheckWriteOperations(true);
			System.out.println("hyy1");
			save = (Integer) hibernateTemplate.save("com.renuka.model.Doctor_Details", doc);
			System.out.println("hyy");
			System.out.println(save+"fjkhmh");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return save;
	}
	
	public List<Doctor_Details> view() {
		List<Doctor_Details> list = hibernateTemplate.loadAll(Doctor_Details.class);
		return list;
	}
	
	public Doctor_Details getdoc(int id) {
		System.out.println("daoimpl");
		Doctor_Details doctor_Details = hibernateTemplate.get(Doctor_Details.class, id);
		return doctor_Details;
	}
	
	public Doctor_Details getdoc(String userName) {
		Doctor_Details doctor_Details = hibernateTemplate.get(Doctor_Details.class, userName);
		return doctor_Details;
	}

	@Transactional
	public int updateDoctor(Doctor_Details doc) {
		hibernateTemplate.update(doc);
		return 0;

	}
	@Transactional
	public int delete(int id) {
		Doctor_Details doctor_Details = hibernateTemplate.get(Doctor_Details.class, id);
		hibernateTemplate.delete(doctor_Details);
		return 0;
	}
}
