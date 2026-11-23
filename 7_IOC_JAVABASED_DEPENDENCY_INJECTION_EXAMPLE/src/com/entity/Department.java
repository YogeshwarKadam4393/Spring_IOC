package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department {

	private int id;

	private String name;

	@Autowired                     // Autowired is used to Perform Dependency Injection
	@Qualifier(value="company2")   // Qualifier is nothing but if u want the Autowiring in Byname , by default bytype is enabled
	private Company company;

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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
		return "Department [id=" + id + ", name=" + name + ", company=" + company + "]";
	}

}
