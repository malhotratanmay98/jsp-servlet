package com.demo;

//we will learn about filters , wildcards and session timeout here. Check web.xml file for more info on them

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class F1 implements Filter {

   
    public F1() {
        // TODO Auto-generated constructor stub
    }

    
    public void init(FilterConfig fConfig) throws ServletException {
		
	}
    
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	System.out.println("i am in watching you..i am filer F1");
		
		HttpServletRequest req= (HttpServletRequest) request;
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL().toString());
		
		chain.doFilter(request, response);
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}


	
	

}
