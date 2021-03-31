<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>

	<h3>Product List</h3>
		<font color="red">${product}</font>
		<font color="red">${CategoryChanged}</font>
		<font color="red">${errorMessage}</font>
	<form action="/changecategory" method="get">
	<input type="submit" value ="Change Category">
	</form>
	<br>
	<form action ="admin" method="get">
		<input type ="submit" name="back" value="Back">
	</form>
</body>
</html>