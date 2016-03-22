package com.training.control;

import com.training.domains.*;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.training.entity.Student;

@Controller
@RequestMapping("first.htm")
public class FirstController {
	@Autowired
HibernateSpringExample dao ;
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student student;
	

	@RequestMapping(name="/first.htm",method = RequestMethod.GET)
	public ModelAndView init(){

			System.out.println("sgkljklrjgh+++++++++++++++++++++++++++++++++++++++++++++++++");
		mdl.setViewName("AddDetails");
		
		mdl.addObject("command",student);
		
		return mdl;
	}
	/*@RequestMapping(name="/Second.htm",method = RequestMethod.GET)
	public ModelAndView init1(){

			System.out.println("sgkljklrjgh+++++++++++++++++++++++++++++++++++++++++++++++++");
		mdl.setViewName("AddDetails");
		
		mdl.addObject("command",student);
		
		return mdl;
	}*/

	@ModelAttribute("DepartmentList")
	public String[] Departments(){
		return new String[]{"Computer Science","Electronics and Communication Engineering","Chemical Engineering","Industrial Endineering"};
	}
	
	@RequestMapping(name="/first.htm",method = RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("studentObj") Student student) {
		Long key=(Long)dao.add(student);
		mdl.setViewName("Success");
		return mdl;
	}
	/*@RequestMapping(name="/Second.htm",method = RequestMethod.POST)
	public ModelAndView onSubmit1(@ModelAttribute("studentObj") Student student) {
		Long key=(Long)dao.add(student);
		mdl.setViewName("Success");
		return mdl;
	}*/
}