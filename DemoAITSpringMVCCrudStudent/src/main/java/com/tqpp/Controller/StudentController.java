package com.tqpp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tqpp.Model.Student;
import com.tqpp.service.StudentService;



@Controller
public class StudentController
{
	
	@Autowired
	private StudentService studservice;
	
	
	@GetMapping("/")
	public ModelAndView startpage()
	{
	    List<Student> lst = studservice.getAllStudents();
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("studlist",lst);
		return mv;
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id)
	{
		Student obj = studservice.getStudentById(id);
		if(obj!=null)
			studservice.deleteStudent(obj);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/add")
	public String AddNewStudent()
	{
		return "add";
	}
	
	@GetMapping("/save")
	public String saveStudent(@ModelAttribute("stud") Student s1, BindingResult results) throws Exception
	{
		System.out.println("**************"+s1);
		if(results.hasErrors())
			throw new Exception("Please enter valid percentage");
		//System.out.println(s1);
		studservice.insertStudent(s1);
		return "redirect:/";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String someException(Exception e)
	{
		System.out.println("Error"+e);
		return "error";
	}
	
	
	@GetMapping("/edit")
	public ModelAndView editStudent(@RequestParam("id") int id)
	{
		Student s2= studservice.getStudentById(id);
		ModelAndView mv = new ModelAndView("edit");
		mv.addObject("sobj",s2);
		
		return mv;
	}
	

}
