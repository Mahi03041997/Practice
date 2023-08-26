package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/collectionconfig.xml");
    
Student student = (Student) context.getBean("student1");
System.out.println(student.getId());
System.out.println(student.getName());
System.out.println(student.getPhoneNumbers());
System.out.println(student.getAdress());
System.out.println(student.getCourse());
	}}
