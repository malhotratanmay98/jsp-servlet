package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("ename");
		String city=request.getParameter("city");
		String designation=request.getParameter("designation");
		Double salary=Double.parseDouble(request.getParameter("salary")); //you have to convert string to doubel.
		
		
		//writing jdbc connection in servlet -- BAD CODE
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yms1?useSSL=false", "root", "root");
		
			PreparedStatement pstmt=
					connection.prepareStatement("insert into emp(ename, city, desi, salary) values(?,?,?,?)");
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setString(3, designation);
			pstmt.setDouble(4, salary);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out.print("name of employee: "+ name + "<br>" );
		out.print("city of employee: "+ city + "<br>" );
		out.print("Designation of employee: "+ designation + "<br>" );
		out.print("salary of employee: "+ salary );
		
	}

}
