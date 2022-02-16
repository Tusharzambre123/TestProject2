package com.ait;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Course 
{
 private String cname;
 private int cfees;
 
public Course() {
	super();
	// TODO Auto-generated constructor stub
}


public Course(String cname, int cfees) {
	super();
	System.out.println("In Parameterized constructor of Course");
	this.cname = cname;
	this.cfees = cfees;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCfees() {
	return cfees;
}
public void setCfees(int cfees) {
	this.cfees = cfees;
}

@PostConstruct //- by using Annotations -> Life Cycle of Bean
public void  myinit() 
{
	System.out.println("In Course init method");
}

@PreDestroy //- by using Annotations -> Life Cycle of Bean
public void destroy() 
{
	System.out.println("Course is destroyed");
}


@Override
public String toString() {
	return "Course [cname=" + cname + ", cfees=" + cfees + "]";
}
 
 
}
