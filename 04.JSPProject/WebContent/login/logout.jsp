<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.removeAttribute("loginId"); //세션의 loginId를 지움

	session.invalidate(); //세션에 있는 모든값들을 지우는 것	

	response.sendRedirect("main.jsp");
%>    
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>

</body>
</html>		    