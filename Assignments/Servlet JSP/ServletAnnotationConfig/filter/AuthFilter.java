package com.example.java.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "AuthFilter", urlPatterns = {"/auth"})
public class AuthFilter implements Filter {

    
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("userName");
		if(userName!=null) {
			System.out.println("Request recieved from "+userName);
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<!DOCTYPE><html>");
			out.println("<head><title>Welcome</title></head>");
			out.println("<body><h1>valid username</h1></body>");
			out.println("</html>");
			chain.doFilter(request, response);
		}
		else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<!DOCTYPE><html>");
			out.println("<head><title>Welcome</title></head>");
			out.println("<body><h1>Invalid username</h1></body>");
			out.println("</html>");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
