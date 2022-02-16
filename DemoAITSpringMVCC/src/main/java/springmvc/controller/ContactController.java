package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController 
{
	// Use of Model Attribute 
	@ModelAttribute
	public void comonDataForModel(Model m)
	{
		m.addAttribute("Header","WELCOME TO HERE");
    	m.addAttribute("Desc","For Registration");
    	System.out.println("Adding common data to model");
	}
	
	
	
    @RequestMapping("/contact") // url mapping
	public String showForm(Model m) // It is request handler
	{
    	/*m.addAttribute("Header","WELCOME TO HERE");
    	m.addAttribute("Desc","For Registration");*/
    	System.out.println("Creating form");
		return "contact"; 
	}
    
    
    @RequestMapping(path="/processform", method= RequestMethod.POST)
    public String handForm(@ModelAttribute User user, Model model)
    { 	
    	System.out.println(user);
    	
    	//process
    	
    /*	model.addAttribute("name",UserName);
    	model.addAttribute("email",userEmail);
    	model.addAttribute("password",userPassword);
    	*/
    	
    	model.addAttribute("user", user);
    	
   /* 	model.addAttribute("Header","WELCOME TO HERE");
    	model.addAttribute("Desc","For Registration");
    */	
    	return "success";
    }
}

/*
 // Use of RequestParam
 @Controller
public class ContactController 
{
    @RequestMapping("/contact") // url mapping
	public String showForm() // It is request handler
	{
		return "contact"; 
	}
    
    
    @RequestMapping(path="/processform", method= RequestMethod.POST)
    public String handForm(@RequestParam("email") String userEmail,
    		@RequestParam("userName") String UserName,
            @RequestParam("password") String userPassword, Model model)//Model for sending data from controller
                                                                         // to view
    {
    	System.out.println("user email" + userEmail);
    	System.out.println("user Name " + UserName);
    	System.out.println("Password " + userPassword);
    	
    	//process
    	
    	model.addAttribute("name",UserName);
    	model.addAttribute("email",userEmail);
    	model.addAttribute("password",userPassword);
    	
    	return "success";
    }
    */
 

