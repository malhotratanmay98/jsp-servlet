package com.web.controller;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.exceptions.EmployeeNotFoundException;
import com.model.persistance.Employee;
import com.model.service.EmployeeService;
import com.model.service.EmployeeServiceImpl;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action"); //capturing the value of key and doing operations accordingly
		
		if (action.equalsIgnoreCase("showall")) {
			List<Employee> employees = employeeService.getAll();
			request.setAttribute("employees", employees);
			RequestDispatcher rd = request.getRequestDispatcher("allemps.jsp");
			rd.forward(request, response);
		}
		else if(action.equalsIgnoreCase("addemp")) {
			RequestDispatcher rd = request.getRequestDispatcher("addemp.jsp");
			rd.forward(request, response);
		}
		else if(action.equalsIgnoreCase("delete")) {
			Integer id= Integer.parseInt(request.getParameter("id").trim());
			employeeService.deleteEmployee(id);
			response.sendRedirect("EmployeeController?action=showall");
		}
		else if(action.equalsIgnoreCase("update")) {
			Integer id= Integer.parseInt(request.getParameter("id").trim());
			
			Employee employee=employeeService.getById(id)
					.orElseThrow(()-> new EmployeeNotFoundException("emp with id"+ id+" is not found") );
			
			request.setAttribute("employee", employee);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}

	}
	
	//Add or update ?

	//PRG:After "P"ost "R"edirect to "G"et
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id=Integer.parseInt(request.getParameter("id").trim());
		
		String ename=request.getParameter("ename");
		String city=request.getParameter("city");
		String desi=request.getParameter("desi");
		
		Double salary=Double.parseDouble(request.getParameter("salary"));
		
		Employee employee=new Employee(ename, city, desi, salary);
		 //employeeService.addEmployee(employee);
	
		//if id ==0 then he want to new rec else he want to update
		if(id==0) {
		 employeeService.addEmployee(employee);
		}else {
			employeeService.updateEmployee(id, employee);
		}
		
		response.sendRedirect("EmployeeController?action=showall");  //redirecting to the same page but with value showall
	}

}