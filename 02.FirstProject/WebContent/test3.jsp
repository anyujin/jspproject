<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	out.print("Hello JSP"); //out -내장객체
	
	String name = request.getParameter("name"); //request -내장객체, response
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	out.print(name);
	out.print(id);
	out.print(pwd);
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>