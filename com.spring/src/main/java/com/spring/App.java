package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Employee emp = (Employee) context.getBean("emp");
       Employee em = (Employee)context.getBean("emp1");
       System.out.println(em);
       System.out.println(emp);
    }
}
