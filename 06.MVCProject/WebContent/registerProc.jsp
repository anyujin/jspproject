<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="exam.dao.*"%>    
<%@page import="exam.dto.*" %>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pwd");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String addr = request.getParameter("addr");
	
	//1. JDBC 드라이버 로드
	//2. 데이터 베이스 연결
	MemberDAO dao = new MemberDAO();
	
	Member member = new Member();
	
	member.setId(id);
	member.setPass(pass);
	member.setName(name);
	member.setAge(Integer.parseInt(age));
	member.setGender(gender);
	member.setAddr(addr);
	
	//3. SQL문 실행
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