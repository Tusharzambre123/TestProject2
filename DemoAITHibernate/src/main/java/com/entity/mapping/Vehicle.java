package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Vehicle
{
	
 @Id
 private int vid;
 private String vname;
 @OneToOne
 private Person per;
public Vehicle(int vid, String vname, Person per) {
	super();
	this.vid = vid;
	this.vname = vname;
	this.per = per;
}
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
public Vehicle(int vid, String vname) {
	super();
	this.vid = vid;
	this.vname = vname;
}
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}


public Person getPer() {
	return per;
}
public void setPer(Person per) {
	this.per = per;
}
@Override
public String toString() {
	return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
}
 
 
	
}
