package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmpDao;

@Service
public class EmplserviceIml implements EmpSerivce {

	@Autowired
	EmpDao empDao;

	@Override
	public List<Employee> getEmployee() {

		return empDao.getEmployees();
	}

}
