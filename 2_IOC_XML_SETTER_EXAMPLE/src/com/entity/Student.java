package com.entity;

public class Student {

	private int id;

	private String name;

	private String city;

	
	public Student() {
		System.out.println("Student Constructor...!!");
	}

	public void m1() {
		System.out.println("M1 Method Of Student");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}