package com.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//JDBC driver load ka code listener mein isliye daal rahe h taaki sbse pehle driver load ho


public class DbDriverListener implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent sce)  { 
       
       String driverName=sce.getServletContext().getInitParameter("driver");
		
		try {
			Class.forName(driverName);
			System.out.println("driver is loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
   }
   
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	
}
