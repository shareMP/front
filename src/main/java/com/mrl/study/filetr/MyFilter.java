package com.mrl.study.filetr;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter {

    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	    //Request---
	    System.out.println("filter-------------");
	    
	   HttpServletRequest req = (HttpServletRequest) request;
	   if(req.getRequestURI() != null && !req.getRequestURI().endsWith(".js") && !req.getRequestURI().endsWith(".css")){
	       //
	       if(!req.getRequestURI().endsWith(".html")){
	           req.getRequestDispatcher((req.getRequestURI()+".html").replaceFirst(req.getContextPath(), "")).forward(req, response);
	           return;
	       }
	   }
	    
		chain.doFilter(request, response);
		System.out.println("filter end---------------");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
