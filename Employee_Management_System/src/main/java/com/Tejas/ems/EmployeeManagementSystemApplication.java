package com.Tejas.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.CommandLineRunner;  
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import com.Tejas.ems.entity.Employee; 
import com.Tejas.ems.repository.EmployeeRepository; 

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	@Autowired 
	private EmployeeRepository employeeRepository;

}
