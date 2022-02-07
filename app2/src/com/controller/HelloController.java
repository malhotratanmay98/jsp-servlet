package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	String name=null;
	String age=null;
	String adminEmailValue=null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//name=this.getInitParameter("name");
		//name=config.getInitParameter("name");
		//or you can write like below , removing config 
		name=getInitParameter("name");
		age=getInitParameter("age");
	
		adminEmailValue=getServletConfig().getServletContext().getInitParameter("amdinEmail");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.print("hello to servlet");
		out.print("name:"+ name);
		out.print("age:"+ age);
		out.print("adminEmailValue"+adminEmailValue);
		
	}

	

}
