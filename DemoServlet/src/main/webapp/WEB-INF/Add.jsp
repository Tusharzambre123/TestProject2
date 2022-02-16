<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="black" text="red">
<h1>Welcome to my first JSP Page</h1>
<h4>
Name <%= request.getParameter("snm")%>
Percent <%= request.getParameter("percent")%>
City <%= request.getParameter("city")%>

</h4>
</body>
</html>