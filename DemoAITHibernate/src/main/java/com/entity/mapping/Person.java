package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	private int addharCardNo;
	private String pname;
	private long mobileNo;
	@OneToOne
	private Vehicle veh;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int addharCardNo, String pname, long mobileNo, Vehicle veh) {
		super();
		this.addharCardNo = addharCardNo;
		this.pname = pname;
		this.mobileNo = mobileNo;
		this.veh = veh;
	}
	public int getAddharCardNo() {
		return addharCardNo;
	}
	public void setAddharCardNo(int addharCardNo) {
		this.addharCardNo = addharCardNo;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Vehicle getVeh() {
		return veh;
	}
	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}
	@Override
	public String toString() {
		return "Person [addharCardNo=" + addharCardNo + ", pname=" + pname + ", mobileNo=" + mobileNo + ", veh=" + veh
				+ "]";
	}
	
	
	
	
	
	

}
