package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.entity.Course;
import com.entity.Student;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean("student2", Student.class);
		System.out.println(student);
		
	}

}
