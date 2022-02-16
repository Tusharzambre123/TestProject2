package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/two")
public class SecondServlet extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out=resp.getWriter();
		/*	String u=req.getParameter("fname");
			out.print("Welcome To User "+u);
			System.out.println("second");
			*/
			System.out.println("Second");
			out.print("Successful login user "+req.getParameter("fname"));
			ArrayList<String>list = (ArrayList<String>) req.getAttribute("Technical");
			out.print(list);
			
		/*	ServletContext ctx=getServletContext();
			String d=ctx.getInitParameter("url");
			out.println("Context Data :"+d);
			*/
		
	}
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	 {
		doGet(req,resp);
	}
		
}
