package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;
import com.entity.Student;

public class HomeController {

	public static void main(String[] args) {

//		Resource resource = new ClassPathResource("beans.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		Employee st = (Employee) beanFactory.getBean("emp");
//		st.m1();

		System.out.println("================== USING SINGLETON SCOPE ===============================");
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = (Employee) ac.getBean("emp");
		System.out.println(emp1);

//      Bean IMPORTANT Scopes ---> 1.SINGLETON (By Default Enabled & By Default Bean Scope Is Singleton) 
//                                 2.PROTOTYPE (By Default Disabled)

		Employee emp2 = (Employee) ac.getBean("emp"); // Creating another Object

		// Method 1 ---> To check Object Pointing to which Memory
		System.out.println(emp1 == emp2); // Checking whether both objects reference is pointing to same memory

		// Method 2 ---> To check Object Pointing to which Memory
		System.out.println("EMPLOYEE 1 HASHCODE : " + emp1.hashCode());
		System.out.println("EMPLOYEE 2 HASHCODE : " + emp2.hashCode());

		// THESE ALL ARE IN SINGLETON SO POINTING TO SAME OBJECT

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n================== USING PROTOTYPE SCOPE ===============================");

		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		Student std1 = (Student) ap.getBean("std");

		Student std2 = (Student) ap.getBean("std");

		// Method 1 ---> To check Object Pointing to which Memory
		System.out.println(std1 == std2); // Checking whether both objects reference is pointing to same memory or not

		// Method 2 ---> To check Object Pointing to which Memory
		System.out.println("STUDENT 1 HASHCODE : " + std1.hashCode());
		System.out.println("STUDENT 2 HASHCODE : " + std2.hashCode());

		// THESE ALL ARE IN PROTOTYPE SO POINTING TO DIFFERENT OBJECTS

	}

}
