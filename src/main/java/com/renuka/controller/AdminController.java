package com.renuka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.renuka.model.Doctor_Details;
import com.renuka.service.DoctorDataService;
@Controller
@RequestMapping("/Admin")
public class AdminController 
{
	@Autowired
	private DoctorDataService doctorDataService;
	@Autowired
	private ModelAndView modelAndView;	
	@RequestMapping("/Admin")
	public String viewAdmin(@RequestParam("User") String role)
	{
		return role;
	}
	
	@RequestMapping("/createdoc")
	public String crudDoc() {
		return "Createdoc";
	}
	
	@RequestMapping(path = "/Doctor", method = RequestMethod.POST)
	public String insertDoc(@ModelAttribute Doctor_Details details, Model model) throws Exception {

		if (doctorDataService.insertDocCheck(details)) {
			model.addAttribute("insert", "Inserted Succesfully");
			return "redirect:Createdoc";
		} else {
			model.addAttribute("insert", "Something went wrong");
			return "redirect:Createdoc";
		}
	}
	
	@RequestMapping(path = "/Doctor", method = RequestMethod.GET)
	public ModelAndView viewDocList() throws Exception {
		List<Doctor_Details> view = doctorDataService.view();
		modelAndView.setViewName("viewDoc");
		modelAndView.addObject("doclist", view);
		return modelAndView;
	}
	
	@RequestMapping("/Doctor/{Id}")
	public ModelAndView updateDoc(@PathVariable("Id") int id) throws Exception {
		Doctor_Details doctor_Details = doctorDataService.singleview(id);
		modelAndView.setViewName("singleDoc");
		modelAndView.addObject("doctor", doctor_Details);
		return modelAndView;
	}
	
	@RequestMapping(path = "/Update", method = RequestMethod.POST)
	public String updateDoctor() throws Exception {
		
		return "index";
	}

}
