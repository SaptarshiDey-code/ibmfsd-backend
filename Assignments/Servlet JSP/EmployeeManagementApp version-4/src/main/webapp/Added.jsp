<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="show.do">
<div>
<h2>Employee Added Successfully</h2>
</div>
<div>
<button type="submit">Show Employee</button>
</div>
<div>

  <a href="logout.do"><%session.invalidate(); %>Logout</a>
  </div>
</form>
</body>
</html>