package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Employee;


@Configuration
public class AppConfig {
	
	@Bean(name = "employee")
	public Employee getEmployee(){
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Yogesh");
		employee.setCity("Pune");
		
		return employee;
	}

}
