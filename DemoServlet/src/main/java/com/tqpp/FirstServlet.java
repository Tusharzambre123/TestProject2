package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/one")
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	static int c=0;
	public FirstServlet() 
	{
		System.out.println("In Default Constructor first");
	}
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		/*  c++;
		  PrintWriter out = resp.getWriter();
		  out.println("Welcome"+c);
		  */
		
		String name=req.getParameter("fname");
		String password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		ServletContext ctx=getServletContext();
		ServletConfig cfg=getServletConfig();
		String d=ctx.getInitParameter("url");
		String user=cfg.getInitParameter("username");
		
		
		
		
		
		out.print("<html>");
		out.print("<body bgcolor='Yellow'><h1> Welcome To User "+name+"</h1>");
		out.print("<h4>Context Data"+d+"</h4>");
		out.print("<h4>Config Data"+user+"</h4>");
		out.print("<h2> Your Password Is "+password+"</h2>");
		out.print("</body></html>");
		
		
		
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		    doGet(req,resp); 
		
	}

}
