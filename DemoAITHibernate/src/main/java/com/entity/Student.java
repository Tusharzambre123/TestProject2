package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private int percent;
	private Address addr;
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Student(int sid, String sname, int percent, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.addr = addr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int percent) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", addr=" + addr + "]";
	}
	
	
	

}
