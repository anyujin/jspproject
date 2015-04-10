<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if(id.equals("test") && pwd.equals("1234")){
		out.print("로그인 성공!");
		
		session.setAttribute("loginId", id);
		
		response.sendRedirect("main.jsp");
	}
	else{
		out.print("로그인 실패!");
		response.sendRedirect("loginForm.jsp");
	}
%>
    