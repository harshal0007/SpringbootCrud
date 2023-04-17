package com.saksoft.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saksoft.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	//all crud database method

}
