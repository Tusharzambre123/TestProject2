package com.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestaurant {

	public static void main(String[] args) 
	{
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("Restaurant.xml");
		Restaurant obj = (Restaurant) ctx.getBean("r1");
		System.out.println(obj);

	}

}
