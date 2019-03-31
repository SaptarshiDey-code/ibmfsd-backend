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
<form action="logout.do">
<table style=" display:table-cell">
<tr>
<td colspan="2">Id</td>
<td></td>
<td colspan="2">Name</td>
<td></td>
<td colspan="2">Age</td>
<td></td>
<td colspan="2">Department</td>
<td></td>
<td colspan="2">Gender</td>
<td></td>

<td colspan="2">Address</td>
<td></td>
<td>Salary</td>
<td></td>

<td colspan="2">Edit</td>
<td></td>
<td colspan="2">Delete</td>
<td></td>
</tr>


<%
List <Employee> empList=(List<Employee>)request.getAttribute("empList");

	//int id=Integer.parseInt(request.getParameter("obi"));
		/*if(request.getAttribute("obi")!=null){
			
			Integer id=(Integer)request.getAttribute("obi");
			Employee E=(Employee) request.getAttribute("obE");
			empList.put(id, E);
		}*/
	
	for(Employee e:empList){
	
			
	%>
	
	
	
	<tr>
		<td colspan="2"><%= e.getId() %></td>
		
		<td></td>
		<td colspan="2"><%=   e.getName() %></td>
		<td></td>
		<td colspan="2"><%= e.getAge() %></td>
		<td></td>
		<td colspan="2"><%=  e.getDepartment() %></td>
		<td></td>
		<td colspan="2"><%=  e.getGender() %></td>
		<td></td>

		<td colspan="2"><%=  e.getAddress()%></td>
		<td></td>
		<td colspan="2"><%=  e.getSalary() %></td>
		<td></td>
		<td colspan="2"><a href="edit.do?idE=<%= e.getId()%>">Edit</a></td>
		<td></td>
		
		<td colspan="2"><a href="delete.do?idD=<%= e.getId()%>">Delete</a></td>
		<td></td>
		</tr>
		
		<% } 
	%>
		
		
	<div>
	<button type="submit">Logout</button>
	
	</div>

	
</table>
</form>
</body>
</html>