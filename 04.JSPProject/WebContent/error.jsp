<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>
	<h1>Error!!!!!!!!!!!!!</h1>
	<%= exception.getMessage() %> <!-- 왜 오류가 났는지 알려줌, isErrorPage를 써줘야 오류가 안남 -->
</body>
</html>