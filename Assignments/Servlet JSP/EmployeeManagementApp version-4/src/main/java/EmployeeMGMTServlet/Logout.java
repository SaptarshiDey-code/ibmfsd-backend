package EmployeeMGMTServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout  extends HttpServlet
{
	public void init() {
		
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		session.invalidate();
		RequestDispatcher dis=request.getRequestDispatcher("logout.jsp");
		dis.forward(request, response);
	}

	public void destroy() {
		
		
	}
}
