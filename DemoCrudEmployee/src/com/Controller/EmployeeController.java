package com.Controller;
import java.util.List;
import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.Dao.EmployeeDaoImplementation;
import com.Model.Employee;


public class EmployeeController
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 EmployeeDao edao = new EmployeeDaoImplementation();
		System.out.println("*************WELCOME********");
		char ch='y';
		
		do
		{
		System.out.println("1/Add new Employee/2-Delete Employee /3-Update Employee /4-View all Employee");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		   case 1: System.out.println("*********Insert new Employee Record******");
		           System.out.println("enter empname");
		           String nm = sc.next();
		           System.out.println("enter empqualification");
		           String qual = sc.next();
		           System.out.println("enter empsalary");
		           int sal=sc.nextInt();
		
		Employee e1 = new Employee(nm,qual,sal);
		boolean isinsert =edao.insertEmployee(e1);
		if(isinsert)
			System.out.println("Record inserted successful!!");
		else
			System.out.println("Error!Unsuccessful record inserted");
		break;
		
		   case 4 : List<Employee> employeelist = edao.getAllEmployees();
		            for(Employee ee : employeelist)
		            {
		            	System.out.println(ee);
		            }
		            break;
		            
		   case 2 : System.out.println("*********Deletion**********");
		            System.out.println("Enter Employee ID to delete");
		            int eid=sc.nextInt();
		            Employee eobj=edao.getEmployeeById(eid);
		            if(eobj==null)
		            {
		            	System.out.println("Invalid Employee ID ");
		            }
		            else
		            {
		            	boolean isdelete=edao.deleteEmployeeById(eid);
		            	System.out.println(isdelete?"Employee Deleted Successfully":"Unsuccessful Deletion");
		            }
		            
		   case 3 : System.out.println("********EmployeeUpdation**********");
		            System.out.println("Enter Employee ID to update");
                    eid=sc.nextInt();
                    eobj=edao.getEmployeeById(eid);
		            if(eobj==null)
		            {
		            	System.out.println("Invalid Employee ID ");
		            }
		            else
		            {
		            	System.out.println("Current Employee Name :"+eobj.getEmpname());
		            	System.out.println("Current Employee Qualification :"+eobj.getEmpqualification());
		            	System.out.println("Current Employee Salary :"+eobj.getEmpsalary());
		            	System.out.println("Enter qualification and salary to update");
		            	String newqual=sc.next();
		            	int  newsal=sc.nextInt();
		            	eobj.setEmpqualification(newqual);
		            	eobj.setEmpsalary(newsal);
		            	boolean isupdate=edao.updateEmployee(eobj);
		            	if(isupdate)
		            	{
		            		System.out.println("Record Updated Successfully!!!!");
		            	}
		            	else
		            	{
		            		System.out.println("Error! Unsuccessful updation");
		            	}
		            	
		            }
            
            
		
		} //switch bracket end
		
		System.out.println("Do you want to continue y/n");
		ch = sc.next().charAt(0);
		
	}while(ch=='y'|| ch=='Y');
		System.out.println("*********");
		}
	}
	 

