<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>
<h1> application 객체 </h1>
<hr>
<table border="1">
	<tr>
		<td>getServerInfo()</td>
		<td><%= application.getServerInfo() %></td>
	</tr>
	<tr>
		<td>getContextPath()</td>
		<td><%= application.getContextPath() %></td>
	</tr>
	<tr>
		<td>getRealPath()</td>
		<td><%= application.getRealPath(".") %></td>
	</tr>
</table>
	
</body>
</html>		    