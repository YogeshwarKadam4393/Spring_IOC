package com.entity;

import java.util.List;

public class Employee {

	private int id;

	private String name;

	private String city;

	private List<String> domain;

	
	public Employee() {
		System.out.println("Employee Constructor...!!");
	}

	public void m1() {
		System.out.println("M1 Method Of Employee");
	}

	public List<String> getDomain() {
		return domain;
	}

	public void setDomain(List<String> domain) {
		this.domain = domain;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", domain=" + domain + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}