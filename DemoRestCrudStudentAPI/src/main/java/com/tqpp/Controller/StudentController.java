package com.tqpp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqpp.Model.Student;
import com.tqpp.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService studservice;
	
/*	@ResponseBody
	@GetMapping("/")
	public Student getStudent()
	{
		Student s1 = new Student(1,"Tushar",78,"Pune");
		return s1;
		
	}*/
	
//	@ResponseBody
//	@GetMapping("/") // In XML Format response
/*	@GetMapping(value="/", produces = "application/json") // In JASON Format response
	public ArrayList<Student> getStudent()
	{
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1,"Tushar",78,"Pune");
		al.add(s1);
		al.add(new Student(2,"Yash",89,"Sangli"));
		al.add(new Student(3,"Komal",80,"Mumbai")); 
		al.add(new Student(4,"Faran",67,"Nashik"));
		al.add(new Student(5,"Raj",99,"Kolhapur"));
		return al;
	}
	
	@ResponseBody
    @GetMapping(value="/getAll", produces = "application/json")
	public HashMap<String,Student> m1()
	{
		HashMap<String,Student> hm = new HashMap<String, Student>();
		hm.put("Aniket",new Student(6,"Aniket",66,"Dadar"));
		hm.put("Swati",new Student(7,"Swati",56,"Latur"));
		hm.put("Nagesh",new Student(8,"Nagesh",90,"Dhule"));
		return hm;
	}
	*/
	
	@ResponseBody
//	@GetMapping(value="/students") //  In XML Format response
	@GetMapping(value="/students",produces ="application/json" ) //  In JASON Format response
	public List<Student> getAllStudents()
	{
		System.out.println("Hellloooo");
		return studservice.getAllStudents();
	}
	
/*	@ResponseBody
	@GetMapping(value="/students/{rollno}") // here rollno is variable consider
	public Student getStudentById(@PathVariable("rollno") int id)
	{
		System.out.println(id);
		return studservice.getStudentById(id);
	}
	*/
	
	@ResponseBody
	@GetMapping(value="/students/{rollno}")
	public ResponseEntity<Student> getStudentById(@PathVariable("rollno") int id)
	{
		Student obj = studservice.getStudentById(id);
		if(obj==null)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<Student>(obj,HttpStatus.OK);
		}
	}
	
	
	//how to add object
	//json
	@ResponseBody
	@PostMapping(value="/students")
	public boolean addStudent(@RequestBody Student s)
	{
		System.out.println("********"+s);
		studservice.insertStudent(s);
		return true;
	}
	
	@ResponseBody
	@DeleteMapping("/students/{id}")
	public boolean deleteStudent(@PathVariable("id") int sid)
   {
	  Student s = studservice.getStudentById(sid);
	  studservice.deleteStudent(s);
	   return true;
   }
	
	@ResponseBody
	@PutMapping("/students/{sid}")
	public boolean updateStudent(@PathVariable("sid") int sid, @RequestBody Student s1)
	{
		studservice.updateStudent(s1);
		return true;
		
	}
	
	

}
