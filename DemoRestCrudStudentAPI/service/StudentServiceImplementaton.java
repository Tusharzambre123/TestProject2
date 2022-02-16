package com.tqpp.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqpp.Dao.StudentDao;
import com.tqpp.Model.Student;

@Service
public class StudentServiceImplementaton implements StudentService {

	@Autowired
	public StudentDao sdao;
	
	
	@Override
	public boolean insertStudent(Student s) 
	{
		
		return sdao.insertStudent(s);
	}

	

	@Override
	public boolean updateStudent(Student s) 
	{
	
		return sdao.updateStudent(s);
	}

	@Override
	public List<Student> getAllStudents() 
	{
		return sdao.getAllStudents();
	}

	@Override
	public Student getStudentById(int sid)
	{
	    
		return sdao.getStudentById(sid);
	}



	@Override
	public boolean deleteStudent(Student s) 
	{
		
		return sdao.deleteStudent(s);
	}

}
