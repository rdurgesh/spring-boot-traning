package com.spring.boot.traning.service;

import java.util.List;

import com.spring.boot.traning.domain.Employee;

public interface EmployeeService {

	public Long createEmployee(Employee employee);

	public List<Employee> findAllEmployee();
	
	public List<Employee> findByName(String name);

	public List<Employee> findByAge(int age);

}
