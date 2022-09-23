<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Numbers</title>
</head>
<body>
<h1>Number Adder</h1>
<form action="getNumberServlet"method="post">Enter in the numbers you want to add: 
<input type="text"name="userNumber1"size="10">
<input type="text"name="userNumber2"size="10">
<input type="text"name="userNumber3"size="10">
<input type="submit"value="Calculate Numbers"/>
</form>
</body>
</html>