<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <% JSP 주석 %> --%>
<% 
	int num1=10, num2=20;

	int num3 = num1 + num2;
	
	out.print(num3); // 내장객체
	
	/* JAVA 주석 */
%>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>
<!-- HTML 주석 -->

<% out.print("Hello"); %>
<%= "Hello" %>

</body>
</html>		    