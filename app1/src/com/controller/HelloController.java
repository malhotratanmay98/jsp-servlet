package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //By default , servlet is singleton
    public HelloController() {
      System.out.println("This is the default constructor."); //notic no matter how many times we reload the page only one object is created
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		LocalDateTime date = LocalDateTime.now();
//		out.println("current time is: "+ date.toString());
		
		response.setContentType("text/html");
		//parseInt is used to cast the string in Int format , by default object is passed and we have to cast it according to our need
		
		//get the data from user
		Integer firstNo=Integer.parseInt(request.getParameter("x"));
		Integer secondNo=Integer.parseInt(request.getParameter("y"));
		
		Integer sum = firstNo + secondNo;
//		out.print(sum + "<br>");
//		out.print("powered by YMSLI");
		
		//application context vs session vs request vs page
				HttpSession httpSession=request.getSession();
				
				httpSession.setAttribute("result"	, sum);
				
				//RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
				//rd.forward(request, response);
				
				response.sendRedirect("result.jsp");
	}

	
}
