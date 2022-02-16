package com.List;

import java.util.List;

public class Restaurant 
{
	private List waitersList;

	public Restaurant() {
		super();
		System.out.println("In Default Constructor of Restaurant");
		// TODO Auto-generated constructor stub
	}

	public Restaurant(List waitersList) {
		super();
		this.waitersList = waitersList;
	}

	public List getWaitersList() {
		return waitersList;
	}

	public void setWaitersList(List waitersList) {
		System.out.println("In setter method");
		this.waitersList = waitersList;
	}

	@Override
	public String toString() {
		return "Restaurant [waitersList=" + waitersList + "]";
	}
	
	
	

}
