package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

// How to redirect in spring mvc
//1.redirect prefix
//2.Redirect view


@Controller
public class RedirectController 
{
	//1.using Redirect view
	@RequestMapping("/one") 
	public RedirectView one()
	{
		System.out.println("This is one handler");
		RedirectView rv = new RedirectView();
		//rv.setUrl("enjoy");
		rv.setUrl("https://www.google.com");
		
		return rv;
	}
	
	 @RequestMapping("/enjoy")
		public String two()
		{
	    	System.out.println("This is second handler");
			return "contact";
		}
	
	
	
	
	
	
	
	
	//2.using redirect prefix
/*	@RequestMapping("/one") 
	public String one()
	{
		System.out.println("This is one handler");
		return "redirect:/enjoy";
	}
	
    @RequestMapping("/enjoy")
	public String two()
	{
    	System.out.println("This is second handler");
		return "contact";
	}
*/
}
