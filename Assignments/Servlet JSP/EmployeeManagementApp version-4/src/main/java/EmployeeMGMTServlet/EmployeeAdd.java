package EmployeeMGMTServlet;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeAdd extends HttpServlet{

	Scanner sc=new Scanner(System.in);
	List <Employee> A =new ArrayList();
	
	public void init() {
		
	}
	
		public void doGet(HttpServletRequest request,HttpServletResponse response) {
			try {
			EmployeeDao db=new EmployeeDao();
			Employee ob;
			int id;
			String name;
			int age;
			String dept;
			String gender;
			String address;
			int sal;
			
			id=Integer.parseInt(request.getParameter("id"));
			name=request.getParameter("name");
			age=Integer.parseInt(request.getParameter("age"));
			dept=request.getParameter("dept");
			gender=request.getParameter("gen");
			address=request.getParameter("address");
			sal=Integer.parseInt(request.getParameter("salary"));
			
			
			ob=new Employee(id,name,age,dept,gender,address,sal);
			db.InsertDb(ob);
			System.out.println("Employee Added Successfully");
			RequestDispatcher dis=request.getRequestDispatcher("Added.jsp");
			dis.forward(request, response);
			
}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
			public void destroy() {
				System.out.println("Employee Added");
			}
				
			}
		

