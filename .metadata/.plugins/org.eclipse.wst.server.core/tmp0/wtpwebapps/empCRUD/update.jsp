<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee Record</title>
  <script src="validate.js"></script> 	
</head>
<body>

<!-- while updating , we are sending the pre filled data , so that user can change it accordingly -->
<form action="EmployeeController" method="post">
<!-- hidden will not be visible on UI , agr employee existing hoga , to uski id hogi , else id 0 hogi.
this will help us in reusing the post method for add and update both -->
<input type="hidden" name="id" value="${employee.id}"/>
    <table>
        <tr>
            <td>Enter name:</td>
            <td><input type="text" name="ename" id="nameId" value="${employee.ename}" readonly/></td>
            <td><label id="nameMsg"></label></td>
        </tr>

        <tr>
            <td>Enter city:</td>
            <td><input type="text" name="city" id="cityId" value="${employee.city}" /></td>
            <td><label id="cityMsg"></label></td>
        </tr>


        <tr>
            <td>Enter Design:</td>
            <td><input type="text" name="desi" id="desiId" value="${employee.desi}"/></td>
            <td><label id="desiMsg"></label></td>
        </tr>


        <tr>
            <td>Enter salary:</td>
            <td><input type="text" name="salary" id="salaryId" value="${employee.salary}" /></td>
            <td><label id="salaryMsg"></label></td>
        </tr>

        <tr>
            <td><input type="submit" onclick="return validate();" /></td>
        </tr>
    </table>


</form>
</body>
</html>