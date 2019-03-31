package com.example.java.servlet.filter;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoggingFilter
 */
@WebFilter(filterName = "LoggingFilter", urlPatterns = {"/"})
public class LoggingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String host=request.getRemoteHost();
		request.getContentType();
		request.getRemotePort();
		System.out.println("Request recieved from "+host+"at: " +LocalDate.now());
		//delegate the control further to the filter chain
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("Logging filter initialized");
	}

}
