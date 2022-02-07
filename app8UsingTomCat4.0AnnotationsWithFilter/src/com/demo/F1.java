package com.demo;

// Now we have chosen tomcat v4.0 instead of 2.5 . 
//From 4.0 , web.xml file is not created , its replaced by feature of annotations
//annotations is easy but still there are some things that we can't do with annotations
//for that we must use web.xml so we can create web.xml by choosing generate description deployment stub

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "f1")
public class F1 implements Filter {

   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("i am in filter F1");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}