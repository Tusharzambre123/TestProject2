package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
  private int eid;
  private String ename;
  
  @ManyToOne
  private Department d;
  
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
	
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}


public Employee(int eid, String ename, Department d) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.d = d;
}
public Department getD() {
	return d;
}
public void setD(Department d) {
	this.d = d;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", d=" + d + "]";
}
  

  
}
