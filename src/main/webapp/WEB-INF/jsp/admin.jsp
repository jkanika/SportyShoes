<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>

	Welcome Admin! <!-- <font color="red">${AID}</font> -->
	<br>
	If you want to change password, 
	<form action="/changepassword" method="get">
	<input type="submit" value ="Change Password">
	</form>
	<br>
	<form action="user" method="get">
		View User Details <input type = "text" name="UserId">
		<input type ="submit" value="Get User Details" name="getUserDetails">
	</form>
	
	<br>
	<font color="red">${CategoryChanged}</font>
	<form action="products" method="get">
		View Product Details <input type = "text" name="ProductId">
		<input type ="submit" value="Get Product Details" name="getProductDetails">
	</form>
	
	<br>
	<form action="purchasereport">
		View Purchase report
		<input type ="submit" value="View Purchase Report" name="getPurchaseReport">
	</form>
	
</body>
</html>