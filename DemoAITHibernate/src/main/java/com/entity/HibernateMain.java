package com.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateMain {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
	//	Student s1 = new Student();
	//	s1.setSid(4);
	//	s1.setSname("Aniket");
	//	s1.setPercent(67);
		
	//	Address a1 = new Address();
	//	a1.setAddress("AB5672");
	//	a1.setCity("Sangli");
	//	a1.setState("Maharashtra");
	//	s1.setAddr(a1);
		
	//	session.saveOrUpdate(s1);
	//	s1.setSid(7);
	//	s1.setSname("Yogesh");
	//	s1.setPercent(89);
		
	//	session.save(s1);
	//	s1.setSname("Komal");
		
	//	Student ob = session.get(Student.class,5);
		
	//	if(ob!=null)
	//	session.delete(ob);	
		//System.out.println(ob);
		
		//HQL Query---->
	/*	Query q=session.createQuery("from Student");
		List<Student> al = q.list();
		for(Student s : al)
		{
			System.out.println(s);
		}
		*/
		
	/*	Query q=session.createQuery("from Student where percent>80");
		List<Student> al = q.list();
		for(Student s : al)
		{
			System.out.println(s);
		}
		*/
		
	/*	Query q=session.createQuery("select sname,address,city,state from Student");
		List<Student> al = q.list();
		for(Student s : al)
		{
			System.out.println(s);
		}
		*/
		
	/*	Query q=session.createQuery("select percent from Student order by percent desc");
		List<Integer> al = q.list();
		for(Integer s : al)
		{
			System.out.println(s);
		}
		*/
		
		//Update query
	/*	Query q=session.createQuery("update Student set sname=:a where sid=:b");
		 q.setString("a","Medha");
		 q.setInteger("b",1);
		 q.executeUpdate();
		*/
		
		//Agrregate Function
	/*	Query q=session.createQuery("select max(percent) from Student");
		List<Integer> l = q.list();
		for(Integer x : l)
		{
			System.out.println(x);
		}
		*/
		
		
		
		
		
		
		
		tx.commit();

	}

}
