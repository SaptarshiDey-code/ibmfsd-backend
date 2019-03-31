package EmployeeMGMTServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*
;public class ShowEditForm extends HttpServlet {
	
	public void init() {
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
	{
		
		//System.out.println("ID"+ id);
		try {
			
			EmployeeDao ob=new EmployeeDao();
			Employee E;
			int id=Integer.parseInt(request.getParameter("idE"));
			E=ob.FindEmp(id);
			request.setAttribute("EOB", E);
			
			RequestDispatcher dis=request.getRequestDispatcher("Edit.jsp");
			dis.forward(request, response);
			
//			response.sendRedirect("Edit.jsp");
			
		} 

		catch(Exception e ) {
			e.printStackTrace();
		}
		
		
	}
public void destroy() {
	
}
}
