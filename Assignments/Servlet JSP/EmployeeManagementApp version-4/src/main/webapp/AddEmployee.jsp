<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="added.do" >
<div>
<label for="id">ID</label>
    <input type="number" name="id">
  </div>
  <div >
    <label for="name">Name</label>
    <input type="text"  name="name">
  </div>
  
  <div >
    <label for="Age">Age</label>
    <input type="number" name="age">
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
    <input type="text" name="address">
  </div>
  
   <div >
    <label for="salary">Salary</label>
    <input type="number" name="salary">
  </div>
  <!--  <a href="added.do">Add Employee</a>-->
  <input type="submit" value="Add Employee">
  <a href="show.do">Show All</a>
  
  <div>
  <%session.invalidate();
   
    		
    		%>
  <a href="logout.do">Logout</a>
  </div>
</form>

</body>
</html>