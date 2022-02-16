<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>  <!-- For $ tag-->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- For JSTL tag -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<h1> This is help page</h1>
<h2> Welcome here  </h2>


<%
     /* String name=(String)request.getAttribute("name");
     Integer rollno = (Integer) request.getAttribute("rollnumber");
     LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */

%>

<!-- Using getAttribute method -->
<%-- <h1>Name is <%=name %> </h1>
<h1>RollNumber is <%=rollno %> </h1>
<h1>Time is <%=time %></h1>
 --%>
 
 <h1> My name is
       ${name } <!-- name is key here which is set in home controller class -->
 </h1>
 
 <h1> My RollNumber is
      ${rollnumber } <!-- rollnumber is key here which is set in home controller class -->
 </h1>
 
 <h1> Date and Time is
      ${time } <!-- time is key here which is set in home controller class -->
 </h1>
 
 <hr>
     <c:forEach var="item" items="${marks }">     <!-- Using JSTL - make essay -->
      <h1>${item }</h1>     
     </c:forEach> 

</body>
</html>