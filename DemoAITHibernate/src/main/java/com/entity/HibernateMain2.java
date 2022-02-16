package com.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.mapping.Department;
import com.entity.mapping.Employee;
import com.entity.mapping.Person;
import com.entity.mapping.Vehicle;

public class HibernateMain2 {

	public static void main(String[] args) 
	{

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
	/*	Vehicle v1 = new Vehicle(2313,"Honda");
		Person p1 = new Person(2,"Kirti",7757990999l, v1);
		v1.setPer(p1);
		session.save(p1);
		session.save(v1);
		
		*/
		
		Department dd=new Department();
		dd.setDid(901);
		Employee e1 = new Employee(521,"Sachin",dd);
		Employee e2 = new Employee(522,"Dipti",dd);
		Employee e3 = new Employee(523,"Rajesh",dd);
	//	session.save(e1);
	//	session.save(e2);
	//	session.save(e3);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
	//	Department d1 = new Department(901,"IT", al);
	//	session.save(d1);
		
		
		Query q = session.createQuery("from Employee e inner join e.d");
		List<Object[]> l=q.list();
		for(Object arr[] : l)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		
		tx.commit();

	}

}
