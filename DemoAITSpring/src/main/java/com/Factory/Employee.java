package com.Factory;

public class Employee 
{
	private String ename;
	private String address;
	private int age;
	
	public Employee() {
		super();
		System.out.println("In default constructor of Employee");
		ename="Raj";
		address="Goa";
		age=56;
	
	}
	public Employee(String ename, String address, int age) {
		super();
		this.ename = ename;
		this.address = address;
		this.age = age;
	}
	
	private static Employee employee=null;
	
	private static Employee getEmployeeDetails()
	{
		if(employee==null)
		{
			employee = new Employee();
		}
		return employee;
	}
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
	

}
