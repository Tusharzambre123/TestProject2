package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect 
{
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/crudemployee";
	public static final String USERNAME="root";
	public static final String PASSWORD="Tushar2016094990";
		
   public static Connection getConnection()
   {
	   Connection con=null;
	   try 
	   {
		con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
	   } 
	   catch (SQLException e) 
	   {
		e.printStackTrace();
	    }
	   
	   return con;
	
}
}
