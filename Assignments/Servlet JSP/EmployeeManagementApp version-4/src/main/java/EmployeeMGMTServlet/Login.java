package EmployeeMGMTServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	
	public void init() {
		
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		HttpSession session=request.getSession();
		session.setAttribute("uname", uname);
		session.setAttribute("pass", pass);
		String Aname="admin";
		String Apass="1234";
		if(uname.equals(Aname)&&(pass.equals(Apass))){
			RequestDispatcher dis=request.getRequestDispatcher("AddEmployee.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			out.println("<h3>Worng Credentials</h3>");
			out.println("</body> </html>");
			
		}
		
		
	}
	public void destroy() {
		
	}

}
