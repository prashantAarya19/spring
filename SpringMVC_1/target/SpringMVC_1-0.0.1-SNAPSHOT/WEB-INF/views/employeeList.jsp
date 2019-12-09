<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"
	import="com.np.springmvc.dto.EmployeeDTO, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of employee</title>
</head>
<body>
	<h2>List of employee</h2>
	<%
		List<EmployeeDTO> employees = (List<EmployeeDTO>) request.getAttribute("employees");
		for (EmployeeDTO employee : employees) {
			out.println(employee.getId());
			out.println(employee.getName());
			out.println(employee.getSalary());
		}
	%>
</body>
</html>