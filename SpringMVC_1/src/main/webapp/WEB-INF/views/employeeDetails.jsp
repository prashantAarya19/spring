<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h2>Employee Details</h2>
	
	<%= request.getAttribute("Employee") %><br/>
	Employee details::${Employee}
	<br />
	<h2>Employees Details</h2>
	<br />
	${Employees}
</body>
</html>