package com.Inherit;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//by default, single table inheritance type is activates always.
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class VisitingTeacher extends Teacher
{
	private int hrs,rate;

	public VisitingTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public VisitingTeacher(int tid, String tname,int hrs, int rate) {
		super(tid, tname);
		this.hrs=hrs;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}



	public VisitingTeacher(int hrs, int rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "VisitingTeacher [hrs=" + hrs + ", rate=" + rate + "]";
	}
	
	

}
