<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Repeat Form</title>
<link rel="stylesheet" href = "/style.css" />
</head>
<body>
<h1>Repeater Form</h1>
	
	<form action="/repeat-result">
		<p>Word to repeat: <input type = "text" name = "word" /> </p>
		<p>Times to repeat: <input type = "text" name = "times" /> </p>
		<p><button type = "submit">Repeat Word</button>
	</form>
</body>
</html>