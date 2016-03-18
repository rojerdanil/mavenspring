package com.project.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.project.DAOImp.EmployeeImpDao;
import com.project.module.EmployeeTest;
@Controller  
public class HomeController {
	@Autowired
    EmployeeImpDao employeeImpDao; 
	final static Logger logger = Logger.getLogger(HomeController.class);
	 @RequestMapping("/hello")  
	    public ModelAndView helloWorld() {  
	        String message = "HELLO SPRING MVC HOW R U";  
	        logger.info("I am working log");
	        System.out.println("I am working");
	        /*logger.info("property"+prop.getPropertyByName("emp.name"));*/
	        List<EmployeeTest> ls=employeeImpDao.getEmployeeList();
	        System.out.println("record size:"+ls.size());
	        return new ModelAndView("hellopage", "message", message);  
	    }  
}
