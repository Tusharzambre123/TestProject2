package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAuthor {

	public static void main(String[] args) 
	{
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("Author.xml");
		Author obj = (Author) ctx.getBean("a1");
		System.out.println(obj);
		
	
	}

}
