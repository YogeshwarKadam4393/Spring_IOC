package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.entity.Company;
import com.entity.Department;
import com.entity.Employee;

@Configuration
public class AppConfig {

	@Bean(name = "employee")
	//@Scope("singleton")   // By default Singleton is enabled
	@Scope("prototype")
	public Employee getEmployee() {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Yogesh");
		employee.setCity("Pune");
		// Department department = getDepartment();
		// employee.setDepartment(getDepartment1()); // Manual Way of Injecting
		// Dependency

		return employee;
	}

	@Bean(name = "dep1")
	@Primary // This Method is used as default if any method does not run , then as default this method will Run
	public Department getDepartment1() {

		Department d = new Department();
		d.setId(101);
		d.setName("IT");
		// d.setCompany(getCompany2());

		return d;
	}

	@Bean(name = "dep2")
	public Department getDepartment2() {

		Department d = new Department();
		d.setId(102);
		d.setName("HR");
		// d.setCompany(getCompany1());

		return d;
	}

	@Bean(name = "company1")
	public Company getCompany1() {

		Company company = new Company();
		company.setId(1001);
		company.setName("Google");

		return company;
	}

	@Bean(name = "company2")
	public Company getCompany2() {

		Company company = new Company();
		company.setId(1002);
		company.setName("Microsoft");

		return company;
	}

}
