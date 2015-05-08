<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
    
<% 
	//0. 요청 처리
	request.setCharacterEncoding("UTF-8"); //POST 방식일때 한글 처리
	
	String id = request.getParameter("id");
	
	//1. JDBC 드라아버 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");

	//2. 데이터베이스와 연결 - connect 연결 해주는 것과 같음
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jspuserc", "jsp1234");	
	
	//3. SQL문 실행
	String sql = "delete member where id=?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.setString(1, id);
	
	int result = pstmt.executeUpdate();
	
	if(result == 1)
		response.sendRedirect("list");
	
	//out.print(result);
	
	//4. 데이터베이스와 연결 끊음
	pstmt.close();
	con.close();
	
%>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>

</body>
</html>		    