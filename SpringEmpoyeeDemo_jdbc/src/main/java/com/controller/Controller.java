package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmpSerivce;

@RestController
@RequestMapping(value=("/api"))
public class Controller {
	
	
	// api view all records
	
	@Autowired
	private  EmpSerivce empSerivce;
	
	/**
	 * @return         alt+shift+j for java doc
	 */
	@GetMapping("employee-list")
	public List<Employee> allEmployee(){
	
		return empSerivce.getEmployee();	
	
	}

	@GetMapping("employee-bydid")
	public Employee getEmplyeeDetailsById(){
		return null;
	
	
	
	}
	// add api for create employe details
	
	/**
	 *  this api for create
	 */
	@PostMapping("employee-create")
     void createEmployeeDetails(){}
	
	
	// add api for update employe details
	
	@PutMapping("employee-udpate")
     void udateEmployeedetails(){}
	
	
	//add api for delete
	
	@DeleteMapping("employee-delete")
	 void deleteEmployeedetails(){}
	

}
