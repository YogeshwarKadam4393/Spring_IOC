package com.entity;

public class Employee {

	private int id;

	private String name;

	private String city;

	private Department dep1;

	public void m1() {
		System.out.println("M1 Method Of Employee");
	}

	public Department getDep1() {
		return dep1;
	}

	public void setDep1(Department dep1) {
		this.dep1 = dep1;
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
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", dep=" + dep1 + "]";
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