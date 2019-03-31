package com.example.java.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		System.out.println("Servlet is Listening");
		
	}
	 public void contextDestroyed(ServletContextEvent servletContextEvent) {
		 System.out.println("Listener Destroyed");
	 }
}
