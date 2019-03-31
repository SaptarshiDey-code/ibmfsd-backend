package EmployeeMGMTServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class DeleteEmployee extends HttpServlet

{
	public void init() {
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		try {
			
			EmployeeDao db=new EmployeeDao();
			int id=Integer.parseInt(request.getParameter("idD"));
			//Employee E=db.FindEmp(id);
			db.deleteEmp(id);
			RequestDispatcher dis=request.getRequestDispatcher("show.do");
			dis.forward(request, response);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		
	}

}
