<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#id").change(function() {
			$.ajax({
				url : 'validateUser',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);

					if (responseText != "") {
						$("#id").focus();
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<h3>SignUP</h3>
	<form action="resultPage" method="post">
		<pre>
		<input type="text" name="id" placeholder="ID" id="id" /> <span id = "errMsg"></span><br />
		<input type="text" name="name" placeholder="Name" /><br />
		<input type="text" name="email" placeholder="Email" /><br />
		<input type="submit" name="submit" />
		</pre>
	</form>
</body>
</html>