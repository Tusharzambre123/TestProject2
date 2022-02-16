<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
     <h1>This is Home Page</h1>
     <h1>Called by Home Controller</h1>
     <h1>url /home</h1>
     
     
     
     <%
         String name=(String)request.getAttribute("name");
         Integer id =(Integer)request.getAttribute("id");
         List<String> names=(List<String>) request.getAttribute("n");
     
     %>
     
     <h1>Name is <%= name %></h1>
     
     <h1> Id is <%= id %>  </h1>
     
     <%
         for(String s : names)
         {  
      %>
      
           <h1><%=s%></h1>
      
      <%
         }
      %>
        
     
     </body>
</html>