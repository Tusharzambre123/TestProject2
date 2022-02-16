package com.Factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

	public static void main(String[] args) 
	{
		BeanFactory bf = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
		Student obj=(Student) bf.getBean("s1");
		System.out.println(obj);

	}

}
