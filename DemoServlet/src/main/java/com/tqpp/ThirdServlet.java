package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet implements Servlet 
{
	
	private ServletConfig cfg;
	
	
	public ThirdServlet()
	{
		System.out.println("In default constructor third");
	}

	@Override
	public void destroy() 
	{
		
		
	}

	@Override
	public ServletConfig getServletConfig()
	{
		
		return cfg;
	}

	@Override
	public String getServletInfo()
	{
		
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		this.cfg=config;
		System.out.println("Inside init method");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	HttpServletRequest req=(HttpServletRequest) request;
	HttpServletResponse resp=(HttpServletResponse) response;
	PrintWriter out=resp.getWriter();
	out.println("Welcome To Third Servlet ");
	out.println("User Name "+req.getParameter("fname"));
	out.println("User Password "+req.getParameter("password"));
	
		
	}
	

}
