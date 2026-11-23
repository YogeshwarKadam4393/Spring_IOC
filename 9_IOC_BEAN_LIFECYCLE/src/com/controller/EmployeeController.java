package com.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.entity.Student;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		
		context.close();
		
	}

}
