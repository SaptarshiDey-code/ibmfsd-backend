package EmployeeMGMTServlet;

import java.util.List;
import java.util.Map;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDisplayAll extends HttpServlet {
	
	public void init() {
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		List <Employee> empList=new ArrayList();
		//Map <Integer,Employee> EM=new HashMap<Integer,Employee>();
		
try {
			
			EmployeeDao db=new EmployeeDao();
			//db.fetchAll();
			empList=db.fetchAll();
			
			request.setAttribute("empList",empList);
			RequestDispatcher dis=request.getRequestDispatcher("ShowEmployee.jsp");
			dis.forward(request, response);
			// forward to ShowEmplyees.jsp
			
//			PrintWriter out=response.getWriter();
//			out.println("<html><body>");
//			
//			out.println("<table>");
//			out.println("<tr>");
//			out.println("<td>Id</td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			
//			out.println("<td>Name</td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			
//			out.println("<td>Age</td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			
//			out.println("<td>Department</td>");
//			out.println("<td></td>");
//			out.println("<td>Gender</td>");
//			out.println("<td></td>");
//
//			out.println("<td>Address</td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			
//			out.println("<td>Salary</td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			
//			out.println("<td><a href='Editable.jsp'>Edit</a></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			out.println("<td></td>");
//			
//			out.println("<td><<button type='submit' onclick='${}'>Delete</button></td>");
//			out.println("<td></td>");
//			
//			
//			out.println("<br>#########################################################################################################################################</br>");
//			out.println("</tr>");
//			
//			for(Employee w:empList) {
//				out.println("<tr>");
//				out.println("<td>"+w.getId()+"</td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				
//				out.println("<td>"+w.getName()+"</td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				
//				out.println("<td>"+w.getAge()+"</td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				
//				out.println("<td>"+w.getDepartment()+"</td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				
//				out.println("<td>"+w.getGender()+"</td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//
//				out.println("<td>"+w.getAddress()+"</td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				out.println("<td></td>");
//				
//				out.println("<td>"+w.getSalary()+"</td>");
//				out.println("<td></td>");
//				out.println("<br>-----------------------------------------------------------------------------------------------------------------------------------</br>");
//				out.println("</tr>");
//			}
//			out.println("</table>");
//			out.println("</body></html>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		
	}
	}


