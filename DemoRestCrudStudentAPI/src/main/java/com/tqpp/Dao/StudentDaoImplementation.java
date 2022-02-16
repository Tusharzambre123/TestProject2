package com.tqpp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tqpp.Model.Student;

@Repository
@Transactional
public class StudentDaoImplementation implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean insertStudent(Student s)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(s);
		return true;
	}

	

	@Override
	public boolean updateStudent(Student s) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(s);
		return true;
	}

	@Override
	public List<Student> getAllStudents() 
	{
	   Query<Student> q =sessionFactory.getCurrentSession().createQuery("from Student");
	   List<Student> studlist=q.list();
		return studlist;
	}

	@Override
	public Student getStudentById(int sid) 
	{
		
		return sessionFactory.getCurrentSession().get(Student.class,sid);
	}



	@Override
	public boolean deleteStudent(Student s) 
	{
		sessionFactory.getCurrentSession().delete(s);
		return true;
	}

}
