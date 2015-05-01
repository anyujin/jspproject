<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 

<html>
<head>
		<title>JSP/Servlet Example</title>
</head>

<body>
<h1>회원가입</h1>
<hr>

<form action="registerProc.jsp">	
	<label for="id">아이디 : </label>
	<input type="text" name="id" id="id"><br>
	
	<label for="pwd">비밀번호 : </label>
	<input type="password" name="pwd" id="pwd"><br>
	
	<label for="name">이름 : </label>
	<input type="text" name="name" id="name"><br>
	
	<label for="age">나이 : </label>
	<input type="text" name="age" id="age"><br>
	
	<label for="gender">성별 : </label>
	<input type="radio" name="gender" id="gender" value="m">남자
	<input type="radio" name="gender" id="gender" value="f">여자<br>
	
	<label for="addr">주소 : </label>
	<input type="text" name="addr" id="addr"><br>
	<input type="submit" value="가입">
</form>

</body>
</html>		    