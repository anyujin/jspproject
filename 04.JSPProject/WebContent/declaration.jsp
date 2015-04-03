<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>

<%@ page errorPage="error.jsp" %>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>

<%= str %><br>

<%= abs(-10) %>

<%= 2/0 %><br>

<% File f = new File("abc.txt"); %>

<%!
	String str = "Hello"; //선언문, 변수나 메소드 선언할 때 
	
	public int abs(int n){
		if(n < 0){
			n=-n;
		}
		return n;
	}
%>
</body>
</html>		    