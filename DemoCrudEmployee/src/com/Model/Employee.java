package com.Model;

public class Employee 
{
  private int empid;
  private String empname;
  private String empqualification;
  private int empsalary;
  
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int empid, String empname, String empqualification, int empsalary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empqualification = empqualification;
	this.empsalary = empsalary;
}

public Employee(String empname, String empqualification, int empsalary) {
	super();
	this.empname = empname;
	this.empqualification = empqualification;
	this.empsalary = empsalary;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmpqualification() {
	return empqualification;
}

public void setEmpqualification(String empqualification) {
	this.empqualification = empqualification;
}

public int getEmpsalary() {
	return empsalary;
}

public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empqualification=" + empqualification
			+ ", empsalary=" + empsalary + "]";
}




  
  
}
