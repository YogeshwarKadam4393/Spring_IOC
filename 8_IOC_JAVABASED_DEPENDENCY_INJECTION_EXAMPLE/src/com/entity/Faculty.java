package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Faculty {

	private int id;

	private String name;

	@Autowired
	@Qualifier(value="course1")
	private Course course;

	
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
