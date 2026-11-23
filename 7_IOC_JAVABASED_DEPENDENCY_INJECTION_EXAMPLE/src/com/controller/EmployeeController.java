package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.entity.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee1 = context.getBean("employee", Employee.class);
		System.out.println(employee1);
		Employee employee2 = context.getBean("employee", Employee.class);
		System.out.println(employee2);
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
	}

}
