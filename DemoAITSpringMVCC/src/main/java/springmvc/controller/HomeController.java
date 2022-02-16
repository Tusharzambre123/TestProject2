package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Model----> Sending data from controller to view(jsp)
//ModelAndView----> Sending data from controller to view(jsp)

@Controller
@RequestMapping("/first")
public class HomeController 
{

	// Model
	@RequestMapping(path="/home", method=RequestMethod.GET) //mapping for url
	public String home(Model model) //method of url handling
	{
		System.out.println("This is home url");
		model.addAttribute("name","Tushar Zambre");
		
		model.addAttribute("id",101);
		
		List<String> names=new ArrayList<String>();
		names.add("Akshay");
		names.add("Harshad");
		names.add("Neha");
		names.add("Datta");
		model.addAttribute("n",names);
		
		return "index"; // return object to view(jsp)
    }
	
	@RequestMapping("/about") //mapping for url
	public String about() //method of url handling
	{
		System.out.println("This is about controller");
		return "about"; // return object to view(jsp)
	}
	
	
	//Model And View
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		
		//creating model and view object
		ModelAndView mv = new ModelAndView();
		
		//setting the data
		mv.addObject("name","Uttam Shukla");
		mv.addObject("rollnumber",7899);
		LocalDateTime now =LocalDateTime.now();
		mv.addObject("time", now);
		
		//marks array list
		List<Integer> list = new ArrayList<Integer>();
		list.add(456);
		list.add(123);
		list.add(1890);
		list.add(2000);
		list.add(123);
		
		mv.addObject("marks", list);
		
		
		//setting the view name
		mv.setViewName("help");
		
		return mv; // return object to view(jsp)
	}
}
