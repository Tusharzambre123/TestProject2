<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD NEW STUDENT RECORD</h1>
<form method="get" action="save"> 
<table>
<tr>
<th>Name :</th>
<td><input type="text" name="sname"> </td>
<tr>
<th>Percent </th>
<td><input type="text" name="percent"> </td>
</tr>
<tr>
<th>City  </th>
<td><input type="text" name="city"> </td>
</tr>
<tr>
<td colspan="2">
<input type="submit" name="submit">
</td>
</tr>
</table>
</form>

</body>
</html>