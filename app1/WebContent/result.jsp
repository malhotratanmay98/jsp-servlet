<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<%
	Integer result= (Integer)session.getAttribute("result");
	out.print(result+"<br>");
%>
<br>
<a href="cal.html">want to add more nos?</a>
</body>
</html>