package com.spring.boot.traning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.traning.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findByName(String name);

	public List<Employee> findByAge(int age);

}
