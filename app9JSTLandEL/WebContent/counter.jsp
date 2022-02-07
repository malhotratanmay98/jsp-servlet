<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.*, java.sql.*"
    isThreadSafe="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- decleation tag -->
<%! private int counter=0;%>

<!-- it is a html comments -->
<%-- it is a jsp comments --%>


<%--shortcut of scriplet --%>
<%=out.print(counter++) %>

</body>
</html>