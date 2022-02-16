package com.ait;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("s1")
public class Student implements InitializingBean, DisposableBean //Life Cycle of Bean
{
	//@Value("1") - set value to properties
	private int sid;
	//@Value("Tushar") -set value to properties
	private String sname;
	//@Value("90") - set value to properties
	private int percent;
	@Autowired //- here applied for properties
	private Course c;
	@Autowired //- here applied for properties
	private Trainer t;
	
	
	
	
	public Student(int sid, String sname, int percent, Course c, Trainer t) {
		super();
		System.out.println("In 5");
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.c = c;
		this.t = t;
	}
	
	//@Autowired- here applied for constructor
	public Student(Course c, Trainer t) {
		super();
		System.out.println("In 2");
		System.out.println("In constructor of 2 parameterized");
		this.c = c;
		this.t = t;
	}
	public Student(Course c) {
		super();
		System.out.println("In 1");
		this.c = c;
	}
	public Student() 
	{
		super();
		System.out.println("In Default constructor Of Student");
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int percent) {
		super();
		
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}
	
	
	public Student(int sid, String sname, int percent, Course c) {
		super();
		System.out.println("In Parameterized constructor Of Student");
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.c = c;
	}
	public Course getC() {
		return c;
	}
	
	
	@Autowired //- here applied for setter method of course(Non-primitive data type)
	//@Qualifier("c")
	public void setC(Course c) {
		System.out.println("In setter method of trainer ");
		this.c = c;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) 
	{
		System.out.println("In sid setter method");
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	
	public Trainer getT() {
		return t;
	}
	
	@Autowired //- here applied for setter method Trainer(Non-primitive data type)
	public void setT(Trainer t) {
		this.t = t;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", c=" + c + ", t=" + t + "]";
	}

	public void destroy() throws Exception 
	{
		System.out.println("In Destoy method");
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("In init method");
		// TODO Auto-generated method stub
		
	}
	
	
	

}
