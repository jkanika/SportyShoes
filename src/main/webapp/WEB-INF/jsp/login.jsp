<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
</head>
<body>
	
	<h1> Login Page </h1>
	<font color="red">${errorMessage}</font>
	<font color="red">${PasswordChanged}</font>
	<form method="post" action="login">
		Admin ID <input type ="text" name="AdminID">
		Admin Password <input type ="password" name="AdminPass">
		<input type="submit" name="Login" value ="Login">
	</form>
</body>
</html>