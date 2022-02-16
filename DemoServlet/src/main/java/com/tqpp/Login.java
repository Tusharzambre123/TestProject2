package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() 
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user=request.getParameter("fname");
		String password=request.getParameter("password");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("ReactJS");
		al.add("Angular");
		request.setAttribute("Technical",al);
		
		
		
		
		if(user.equals("Tushar")&& password.equals("root"))
		{
		//	RequestDispatcher rd=request.getRequestDispatcher("two");
		//	rd.forward(request, response);
			
			response.sendRedirect("http://www.google.com");
		}
		else
		{
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			System.out.println("Invalid user!!!!!!!!!!");
			out.print("Re-Enter the data");
			RequestDispatcher rd1=request.getRequestDispatcher("index.html");
			rd1.include(request, response);
			
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
