package com.ait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) 
	{
	      AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	      System.out.println("***********************************************");
	     Student ob1 = (Student) ctx.getBean("s1 ");
	    //  Student ob1 =  ctx.getBean(Student.class,"student");
	      System.out.println(ob1);
	      ctx.close();

	    //  Student ob2 = (Student) ctx.getBean("s1");
	    //  System.out.println(ob2);
	      
	    //  Student ob3 = (Student) ctx.getBean("s3");
	    //  System.out.println(ob3);
	      
	   //   Student ob4 = (Student) ctx.getBean("s4");
	   //   System.out.println(ob4);
	      
	}

}
