<%@page import="EmployeeMGMTServlet.Employee"%>
<%@page import="java.util.*;" %>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Employee e=(Employee)request.getAttribute("EOB");


%>

<form action="show.do">
<div>
<label for="id">ID</label>
    <input type="number" name="id" value="<%=e.getId() %>" readonly="readonly">
  </div>
  <div >
    <label for="name">Name</label>
    <input type="text" name="name" value="<%=e.getName()%>">
  </div>
  
  <div >
    <label for="Age">Age</label>
    <input type="number" name="age" value="<%=e.getAge()%>">
  </div>
  <div >
    <label for="department">Department</label>
    <select name="dept">
    <option value="FSD" selected="selected">FSD</option>
    <option value="SAP-ABAP">SAP-ABAP</option>
    <option value="ORACLE">ORACLE</option>
    <option value="BIG-DATA">BIG-DATA</option>
    </select>
  </div>
  
  <div>
  <label for="Gender">Gender</label>
  <input type="radio" name="gen" value="Male">Male
   <input type="radio" name="gen" value="Female">Female
  </div>
  
  <div >
    <label for="address">Address</label>
    <input type="text" name="address" value="<%=e.getAddress()%>" >
  </div>
  
   <div >
    <label for="salary">Salary</label>
    <input type="number" name="salary" value="<%=e.getSalary()%> ">
  </div>
  
  <!--  <div id="togg">
  <h3>Employee Updated SuccessFully</h3>
  </div>-->
 <button type="submit">Save</button>
 <!--  <button type="submit">Show Employees</button>--> 
</form>

</body>
</html>