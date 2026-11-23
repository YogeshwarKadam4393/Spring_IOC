package com.entity;

public class Employee {

	private int id;

	private String name;

	private String city;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public void m1() {
		System.out.println("M1 Method Of Employee");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}