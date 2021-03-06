<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YMSLI emp app</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

welcome ${user.username}
<br>
<a href="logoutController">logout</a>
<br>
<table>

	<thead>
		<tr>
			<th>id</th>
			<th>ename</th>
			<th>city</th>
			<th>desi</th>
			<th>salary</th>
			<th>delete</th>
			<th>update</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.ename}</td>
				<td>${employee.city}</td>
				<td>${employee.desi}</td>
				<td>${employee.salary}</td>  <!-- out method prints and returns the value as well so in case of update and delete we are sending the id as well on which the action will be performed -->
				<td><a href="EmployeeController?action=delete&id=<c:out value="${employee.id}"/>">delete</a></td>
				<td><a href="EmployeeController?action=update&id=<c:out value="${employee.id}"/>">update</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>
<a href="EmployeeController?action=addemp">add new employee</a>
</body>
</html>