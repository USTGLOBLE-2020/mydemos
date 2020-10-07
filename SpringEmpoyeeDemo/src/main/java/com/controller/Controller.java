package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmpSerivce;

@RestController
@RequestMapping(value=("/api"))
public class Controller {
	
	// inject dependecy service
	@Autowired
	private  EmpSerivce empSerivce;
	
	/**
	 * @return         alt+shift+j for java doc
	 */
	@GetMapping("employee-list")
	public List<Employee> allEmployee(){
	
		return empSerivce.getEmployee();	
	
	}
	

	
	
	
	
	
	
	

}
