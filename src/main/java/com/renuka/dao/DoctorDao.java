package com.renuka.dao;

import java.util.List;

import com.renuka.model.Doctor_Details;

public interface DoctorDao {

	public int insertDoctor(Doctor_Details doc);

	public List<Doctor_Details> view();

	public Doctor_Details getdoc(int id);

	public int updateDoctor(Doctor_Details doc);

	public Doctor_Details getdoc(String userName);
	
	public int delete(int id);


}
