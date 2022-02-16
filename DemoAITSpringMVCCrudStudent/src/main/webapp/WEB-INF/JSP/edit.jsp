<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> EDIT DETAILS </h1>
<form action="save">
Sid : <input type="text" name="sid" value="${sobj.getSid()}">
Name : <input type="text" name="sname" value="${sobj.getSname()}">
<br>
Percent : <input type="text" name="percent" value="${sobj.getPercent()}">
<br> 
City : <input type="text" name="city" value="${sobj.getCity()}">
<br>
<input type="submit" value="save">
</form>
</body>
</html>