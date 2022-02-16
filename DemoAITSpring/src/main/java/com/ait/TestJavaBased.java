package com.ait;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestJavaBased {

	public static void main(String[] args) 
	{
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student obj =ctx.getBean(Student.class);
		System.out.println(obj );
		

	}

}
