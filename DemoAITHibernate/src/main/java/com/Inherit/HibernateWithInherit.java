package com.Inherit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateWithInherit 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Teacher t1 = new Teacher(4,"Kirti");
		PermanentTeacher p1 = new PermanentTeacher(6,"Medha",9000);
		VisitingTeacher v1 = new VisitingTeacher(7,"Deepa",30, 2000);
		session.save(t1);
		session.save(p1);
		session.save(v1);
		
		tx.commit();
		
	}

}
