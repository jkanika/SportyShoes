<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Purchase Report</h3>
	<font color="red">${PurchaseReport}</font>
	<font color="red">${purchaseReportCat}</font>
	<font color="red">${purchaseReportDate}</font>
	<form action="/purchasereport" method="post">
	Enter the category id to view report by Category 
	<input type ="text" name="CategoryID">
	<input type="submit" value ="View">
	</form>
	
	<br>
	<form action="/purchasereports" method="post">
	Enter the date to view report by date 
	<input type ="date" name="DateView">
	<input type="submit" value ="View">
	</form>
	
</body>
</html>