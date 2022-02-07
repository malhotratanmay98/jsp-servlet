package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 Dog dog = null;
	    
	    public void init() throws ServletException{
	    	super.init();
	    	System.out.println("init method of S2 is Called");
	    	//we are using the dog object here
	    	dog=(Dog) this.getServletContext().getAttribute("dog");
	    }
	    
	    
	    //whenever you are adding data in context scope , use synchronous
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Hello to Servlet S2");
		
		dog.setDogName("foo");  //servlet s2 is trying to change the name , when s1 is trying to read
		
		synchronized (this) {
			this.getServletContext().setAttribute("dog", dog); //saving the new state 	
		}
		
		
	}

	
}
 