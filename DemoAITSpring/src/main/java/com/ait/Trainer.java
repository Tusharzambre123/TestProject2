package com.ait;

import org.springframework.stereotype.Component;

@Component
public class Trainer
{
    private String tname;

	public Trainer() {
		super();
		System.out.println("In trainer default constructor");
		// TODO Auto-generated constructor stub
	}

	public Trainer(String tname) {
		super();
		System.out.println("In trainer para constructor");
		this.tname = tname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
	public void  myinit() // XML File method - Life Cycle of Bean
	{
		System.out.println("In Trainer init method");
	}

	public void destroy() // XML File method - Life Cycle of Bean
	{
		System.out.println("Trainer is destroyed");
	}
	
	
	@Override
	public String toString() {
		return "Trainer [tname=" + tname + "]";
	}
    
    
	
}
