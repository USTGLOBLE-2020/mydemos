package com.dao;

import java.util.List;

import com.bean.Employee;

public interface EmpDao {
	
	//list the all records
	public List<Employee> getEmployees();

}