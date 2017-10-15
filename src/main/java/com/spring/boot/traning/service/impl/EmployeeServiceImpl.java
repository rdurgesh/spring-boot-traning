package com.spring.boot.traning.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.traning.domain.Employee;
import com.spring.boot.traning.repository.EmployeeRepository;
import com.spring.boot.traning.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Long createEmployee(Employee employee) {
		Long id = employeeRepository.save(employee).getId();
		return id;
	}

	@Override
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findByName(String name) {
		return employeeRepository.findByName(name);
	}

	@Override
	public List<Employee> findByAge(int age) {
		return employeeRepository.findByAge(age);
	}

}
