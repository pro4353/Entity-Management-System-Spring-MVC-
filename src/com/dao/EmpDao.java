package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Employee;

public interface EmpDao {

	void setTemplate(JdbcTemplate template);

	List<Employee> getEmployees();

	void insertEmployee(Employee e);

	Employee selectEmployee(int acc_no);
	
	int updateEmployee(int amount,int acc_no);

}