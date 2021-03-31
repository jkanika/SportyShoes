<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
	<h3>User List</h3>
	<font color="red">${users}</font>
	<form action ="admin" method="get">
		<input type ="submit" name="back" value="Back">
	</form>
</body>
</html>