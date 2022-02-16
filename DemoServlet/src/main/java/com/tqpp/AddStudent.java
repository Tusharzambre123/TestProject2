package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.PreparableStatement;

@WebServlet("/addstudent")
public class AddStudent  extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
      {
    	String nm=req.getParameter("snm");
    	int percent=Integer.parseInt(req.getParameter("percent"));
    	String city=req.getParameter("city");
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tqpp","root","Tushar2016094990"))
    	{
    	  PreparedStatement pst=con.prepareStatement("insert into student(sname,percent,city)values(?,?,?)");
    	pst.setString(1,nm);
    	pst.setInt(2, percent);
    	pst.setString(3, city);
    	pst.executeUpdate();
    	req.setAttribute("status", "Successfully record added");
    	RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
    	rd.forward(req, resp);
    		
    		
    	} catch (SQLException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    /*	
    	PrintWriter out=resp.getWriter();
    	out.print("<html>");
		out.print("<body bgcolor='Yellow'><h1> Welcome To User "+nm+"</h1>");
    	out.print("<h4> city "+city+"/h4");
    	out.print("</body></html>");
    	*/
    	
    	
      }
      
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }
}
