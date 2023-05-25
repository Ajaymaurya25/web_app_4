<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<hr>
	<form action="addnumber" method="post">
		Number 1:<input type="text" name="num1"> Number 2:<input
			type="text" name="num2"> <input type="submit" value="Addition">
	</form>
	<br>
	<h2>
		<%
		if(request.getAttribute("mike")!=null){
		out.println(request.getAttribute("mike"));
		}
		%>
	</h2>
</body>
</html>