<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@page import="EmployeeMGMTServlet.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Id</td>
<td></td>
<td>Name</td>
<td></td>
<td>Age</td>
<td></td>
<td>Department</td>
<td></td>
<td>Gender</td>
<td></td>

<td>Address</td>
<td></td>
<td>Salary</td>
<td></td>

<td>Edit</td>
<td></td>
<td>Delete</td>
<td></td>
</tr>


<%
List<Employee> empList=(List<Employee>)request.getAttribute("empList");

	
	//List<Employee> eL=new ArrayList();
	//eL=(Employee)O;
	//int ctr=1;
	
	for(Employee e:empList){
		/*request.setAttribute(e.toString()+ctr, e);
		//obS.add(e.toString()+ctr);
		request.setAttribute(""+e.getId(), e);*/

	%>
	
	
	
	<tr>
		<td><%= e.getId() %></td>
		
		<td></td>
		<td><%=  e.getName() %></td>
		<td></td>
		<td><%= e.getAge() %></td>
		<td></td>
		<td><%=  e.getDepartment() %></td>
		<td></td>
		<td><%= e.getGender() %></td>
		<td></td>

		<td><%= e.getAddress()%></td>
		<td></td>
		<td><%= e.getSalary() %></td>
		<td></td>
		<td ><a href="edit.do?idE=<%=e.getId()%>">Edit</a></td>
		<td></td>
		
		<td><a href="delete.do">Delete</a></td>
		<td></td>
		</tr>
		
		<%  } %>

	
</table>
</body>
</html>