package com.saksoft.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saksoft.springboot.model.Employee;
import com.saksoft.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = new Employee();
		employee.setFirstName("Raj");
		employee.setLastName("Verma");
		employee.setEmailId("raj.verma@imagine.com");
		employee.setAge(35);
		employeeRepository.save(employee);
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Vaibhav");
		employee1.setLastName("Telang");
		employee1.setEmailId("v.telang@futureready.com");
		employee1.setAge(29);
		employeeRepository.save(employee1);
		
		Employee employee2 = new Employee();
		employee2.setFirstName("Ketan");
		employee2.setLastName("Bahadur");
		employee2.setEmailId("k.bahadur@infonext.com");
		employee2.setAge(32);
		employeeRepository.save(employee2);
		
		Employee employee3 = new Employee();
		employee3.setFirstName("Abhishek");
		employee3.setLastName("Raj");
		employee3.setEmailId("abhi.raj@softsol.com ");
		employee3.setAge(30);
		employeeRepository.save(employee3);
		
		
	}

}
