package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.entity.Batch;
import com.entity.Faculty;
import com.entity.Student;
import com.entity.Course;

@Configuration
public class AppConfig {

	@Bean(name = "student1")
	public Student getStudent1() {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Yogeshwar");
		//student.setBatch(getBatch1());
		
		return student;
	}
	
	@Bean(name = "student2")
	public Student getStudent2() {
		
		Student student = new Student();
		student.setId(2);
		student.setName("Sarvadnya");
		//student.setBatch(getBatch1());
		
		return student;
	}
	
	@Bean(name = "batch1")
	@Primary
	public Batch getBatch1() {
		
		Batch batch = new Batch();
		batch.setId(1001);
		batch.setName("B75");
		//batch.setFaculty(getFaculty1());
		
		return batch;
	}
	
	@Bean(name = "batch2")
	public Batch getBatch2() {
		
		Batch batch = new Batch();
		batch.setId(1002);
		batch.setName("B76");
		//batch.setFaculty(getFaculty2());
		
		return batch;
	}
	
	@Bean(name = "faculty1")
	@Primary
	public Faculty getFaculty1() {
		
		Faculty faculty = new Faculty();
		faculty.setId(10001);
		faculty.setName("Rushant Sir");
		//faculty.setCourse(getCourse());
		
		return faculty;
	}
	
	@Bean(name = "faculty2")
	public Faculty getFaculty2() {
		
		Faculty faculty = new Faculty();
		faculty.setId(10002);
		faculty.setName("Nilesh Sir");
		//faculty.setCourse(getCourse());
		
		return faculty;
	}
	
	@Bean(name = "course1")
	@Primary
	public Course getCourse1() {

		Course course = new Course();
		
		course.setId(101);
		course.setName("Java");
		
		return course;
	}

	@Bean(name = "course2")
	public Course getCourse2() {

		Course course = new Course();
		
		course.setId(101);
		course.setName("Java");
		
		return course;
	}


}
