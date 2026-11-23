package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Student;

@Configuration
public class AppConfig {

	@Bean(name = "student")
	public Student getStudent() {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Yogeshwar");
		//student.setBatch(getBatch1());
		
		return student;
	}
	


}
