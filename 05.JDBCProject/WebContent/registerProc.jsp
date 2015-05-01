<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<% 
	//0. 요청 처리
	request.setCharacterEncoding("UTF-8"); //POST 방식일때 한글 처리
	
	String id = request.getParameter("id");
	//out.print(id);
	String pass = request.getParameter("pwd");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String addr = request.getParameter("addr");
	
	//1. JDBC 드라아버 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");

	//2. 데이터베이스와 연결 - connect 연결 해주는 것과 같음
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jspuserc", "jsp1234");	
	
	//3. SQL문 실행
	//1) Statment 객체 이용
	/* String sql = "insert into member values('"+ id +"', '"+ pass +"', '홍길동', 20, '1', '서울시', '2015-04-17')";
	Statement stmt = con.createStatement();	//insert문으로써 역할을 할수 있게 해주는 것
	int result = stmt.executeUpdate(sql);	//executeUpdate = 적용된 행 보여줌
	
	out.print(result); */
	
	//2) PreparedStatement 객체 이용
	String sql = "insert into member values(?, ?, ?, ?, ?, ?, default)";
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	//바인딩 - 가져온 값과 매칭
	pstmt.setString(1, id);
	pstmt.setString(2, pass);
	pstmt.setString(3, name);
	pstmt.setInt(4, Integer.parseInt(age));
	pstmt.setString(5, gender);
	pstmt.setString(6, addr);
	
	int result = pstmt.executeUpdate();
	
	out.print(result);
	
	//4. 데이터베이스와 연결 끊음
	pstmt.close();
	//stmt.close();
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