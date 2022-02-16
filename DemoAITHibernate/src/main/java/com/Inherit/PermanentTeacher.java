package com.Inherit;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//by default, single table inheritance type is activates always.
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class PermanentTeacher extends Teacher
{  
	private int salary;

	public PermanentTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentTeacher(int tid, String tname) {
		super(tid, tname);
		// TODO Auto-generated constructor stub
	}
	
	public PermanentTeacher(int tid, String tname,int salary)
	{
		super(tid,tname);
		this.salary=salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermanentTeacher [salary=" + salary + "]";
	}
	
	

}
