package com.Factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("employee.xml");
		   Employee eobj=(Employee)ctx.getBean("emp");
		   System.out.println(eobj);

	}

}
