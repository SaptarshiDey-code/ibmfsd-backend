package com.example.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/GreetingServlet", loadOnStartup = 1)
public class GreetingServlet extends HttpServlet {

	public void init() {
		System.out.println("Greetings Servlet Intialised");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request,response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<!DOCTYPE><html>");
		out.println("<head><title>Welcome</title></head>");
		out.println("<body><h1>Welcome Lavanya</h1></body>");
		out.println("</html>");

	}

}
