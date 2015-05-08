<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="exam.dao.*"%>    
<%
	MemberDAO dao = new MemberDAO();

	dao.deleteMember();
%>    
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>

</body>
</html>		    