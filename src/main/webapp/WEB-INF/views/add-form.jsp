<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Form</title>
<link rel="stylesheet" href = "/style.css" />
</head>
<body>
	<h1>Add Two Numbers</h1>
	
	<form action="/add-result">
		<p>First number: <input type = "text" name = "num1" /> </p>
		<p>Second number: <input type = "text" name = "num2" /> </p>
		<p><button type = "submit">Add numbers</button>
	</form>
	
</body>
</html>