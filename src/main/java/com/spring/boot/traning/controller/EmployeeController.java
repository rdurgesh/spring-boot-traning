package com.spring.boot.traning.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.traning.domain.Employee;
import com.spring.boot.traning.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;

	@PostMapping(value = "/employee")
	public Long createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@GetMapping(value = "/employees")
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployee();
	}

	@GetMapping(value = "/employeesByName")
	public List<Employee> findByName(@RequestParam("name") String name) {
		return employeeService.findByName(name);
	}

	@GetMapping(value = "/employees/{age}")
	public List<Employee> findByAge(@PathVariable int age) {
		return employeeService.findByAge(age);
	}

}
