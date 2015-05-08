<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="exam.dao.*, exam.dto.*"%>    
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pwd");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String addr = request.getParameter("addr");
	
	MemberDAO dao = new MemberDAO();
	
	Member member = new Member();
	
	member.setId(id);
	member.setPass(pass);
	member.setName(name);
	member.setAge(Integer.parseInt(age));
	member.setGender(gender);
	member.setAddr(addr);
	
	dao.insertMember(member);

%>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>

</body>
</html>		    