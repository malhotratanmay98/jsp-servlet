package com.demo;


//Selected ServletContextListener


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class DogListener implements ServletContextListener {

	private Dog dog=null;
	

    public void contextInitialized(ServletContextEvent sce)  {
    	
    	String dogName=sce.getServletContext().getInitParameter("dogName");
    	
    	dog=new Dog(dogName);
    	
    	//WE ARE STORING A DOG OBJECT SO THAT ANY JSP CAN USE IT
    	sce.getServletContext().setAttribute("dog",dog);
    	
         System.out.println("Servlet context is initialized");
    }
   
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("Servlet context is Destroyed");
         
         sce.getServletContext().removeAttribute("dog"); //once the work is done , remove the dog object
    }


	
}
