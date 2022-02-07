<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- jsp:forward is kind of request dispatcher in jsp , it is used with action tag ,
 key is action , value is showall -->
 
<jsp:forward page="EmployeeController?action=showall"></jsp:forward>

</body>
</html>