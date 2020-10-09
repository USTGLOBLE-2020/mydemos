package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;


@Repository
public class EmpDaoHibImpl {

	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Employee> getEmployeelist() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> query = currentSession.createQuery("from empoyees", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

}
