<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mileage Form</title>
<link rel="stylesheet" href = "/style.css" />
</head>
<body>
	<h1>Mileage Form</h1>
	
	<form action="/mileage-result">
		<p>Mileage (MPG): <input type = "text" name = "mpg" /> </p>
		<p>Gallons in tank: <input type = "text" name = "gallons" /> </p>
		<p><button type = "submit">Calculate Mileage</button>
	</form>
</body>
</html>