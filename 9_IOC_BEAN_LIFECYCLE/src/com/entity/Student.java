package com.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	private int id;

	private String name;

	
	public Student() {
		System.out.println("Default contructor Called");
	}
	
	@PostConstruct
	public void inti() {
		System.out.println("File Opening");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("File Closed");
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
