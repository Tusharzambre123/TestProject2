package com.Controller;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImplementation;
import com.Model.Student;


public class StudentController
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentDao sdao=new StudentDaoImplementation();
		
		
		System.out.println("********************WELCOME USER********************");
		char ch='y';
		do
		{
			System.out.println("1-Add New Student \n2-Delete Student \n3-Update Student \n4-View All Student");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("*****Insert New Student Record******");
					System.out.println("Enter name");
					String nm=sc.next();
					System.out.println("Enter percentage");
					int per=sc.nextInt();
					System.out.println("Enter date of birthdate(yyyy-mm-dd)");
					String birthday=sc.next();
					System.out.println("Enter city");
					String city=sc.next();
					Date bdate=Date.valueOf(birthday);
				    Student s1=new Student(nm,per,bdate,city);
				    boolean isinsert=sdao.insertStudent(s1);
				    if(isinsert)
				    	System.out.println("Record inserted successfully!!");
				    else
				    	System.out.println("Error!Unsuccessful insertion ");
				    
					break;
			case 4: System.out.println("*****Student Details******");
				    List<Student> studentlist=sdao.getAllStudents();
				    for(Student ob:studentlist)
				    {
				    	System.out.println(ob);
				    }
				    break;
				    
			case 2:System.out.println("********Deletion********");
					System.out.println("Enter studentid to delete");
					int sid=sc.nextInt();
					Student sobj=sdao.getStudentById(sid);
					if(sobj==null)
						System.out.println("Invalid student id");
					else
					{
						boolean isdelete=sdao.deleteStudentById(sid);
						System.out.println(isdelete?"Student deleted successfully":"Unsuccessful Deletion");
					}
					break;
			case 3: System.out.println("*******Student Updation********");
			        System.out.println("Enter student id to update");
			        sid=sc.nextInt();
			        sobj=sdao.getStudentById(sid);
					if(sobj==null)
						System.out.println("Invalid student id");
					else
					{
						System.out.println("Current Student Name: "+sobj.getSname());
						System.out.println("Current Student Percent: "+sobj.getPercent());
						System.out.println("Current Student City: "+sobj.getCity());
						System.out.println("Enter percent and city to update with ");
						int newpercent=sc.nextInt();
						String newcity=sc.next();
						sobj.setPercent(newpercent);
						sobj.setCity(newcity);
						boolean isupdate=sdao.updateStudent(sobj);
						if(isupdate)
					    	System.out.println("Record updated successfully!!");
					    else
					    	System.out.println("Error!Unsuccessful updation ");
						
						
					}
			
				
			
			}
			
			System.out.println("Do you want to continue y/n");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
		
		System.out.println("******Thank you*******");
	}
	
	}
	 

