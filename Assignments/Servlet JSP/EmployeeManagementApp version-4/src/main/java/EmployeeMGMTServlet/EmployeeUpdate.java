package EmployeeMGMTServlet;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeUpdate extends HttpServlet {
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
		request.setAttribute("id", id);
		name=request.getParameter("name");
		request.setAttribute("name",name);
		age=Integer.parseInt(request.getParameter("age"));
		request.setAttribute("age", age);
		dept=request.getParameter("dept");
		request.setAttribute("dept",dept);
		gender=request.getParameter("gen");
		request.setAttribute("gen", gender);
		address=request.getParameter("address");
		request.setAttribute("add", address);
		sal=Integer.parseInt(request.getParameter("salary"));
		request.setAttribute("sal",sal);
		
		ob=new Employee(id,name,age,dept,gender,address,sal);
		db.UpdateEmployee(ob,id);
		/*request.setAttribute("obi", ob.getId());
		request.setAttribute("obE", ob);*/
		//Map<Integer,Employee> empList=(Map<Integer,Employee>)request.getAttribute("empList");
		//empList.put(id, ob);
		//request.setAttribute("empList", empList);
		//System.out.println(empList.keySet());
		System.out.println("Employee Updated Successfully");
		
		
		//request.setAttribute("empList", emp);
		RequestDispatcher dis=request.getRequestDispatcher("show.do");
		dis.forward(request, response);
		
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
}


