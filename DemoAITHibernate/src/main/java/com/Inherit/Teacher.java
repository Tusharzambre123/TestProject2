package com.Inherit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//by default, single table inheritance type is activates always.
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Teacher 
{
	@Id
   private int tid;
   private String tname;
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public Teacher(int tid, String tname) {
	super();
	this.tid = tid;
	this.tname = tname;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
@Override
public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + tname + "]";
}
   
   
	
}
