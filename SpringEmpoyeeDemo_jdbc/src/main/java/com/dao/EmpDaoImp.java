package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmpDaoImp implements EmpDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	//spring jdbc jdbcTemplate
	class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

			Employee employee = new Employee();

			// employee.setId(rs.getRowId("id"));
			employee.setFirst_name(rs.getString("first_name"));
			employee.setLast_name(rs.getString("last_name"));
			employee.setEmail_address(rs.getString("email_address"));
			return employee;
		}

	}

	// get the list of emloyess // go your implement for jdbc or spring jpa in this
	// class
	public List<Employee> getEmployees() {

		String sql = "select * from employees";

		return jdbcTemplate.query(sql, new EmployeeRowMapper());

	}

}
