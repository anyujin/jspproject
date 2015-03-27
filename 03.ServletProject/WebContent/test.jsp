<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
	<title>JSP/Servlet Example</title>
	<style>
		/*  */
		body {
			background-image: url("minion.jpg");
			background-repeat: no-repeat;
			background-attachment: fixed;
		}	
		input, select, textarea {
			border: green 1pt solid;
			color: red;
			font-size: 30px;
			background-color: gold;	
		}
	</style>
	<script>
		function gofunc() {
			alert("Hello JavaScript!");
		}
	
	</script>
</head>
<body>
<!-- test.jsp -->
<h1>request test</h1>
<hr>

<form action="TestServlet" onsubmit="return gofunc()">
	<label for="name">이름 : </label><input type="text" id="name" name="name"><br>
	<label for="pwd">비밀번호 : </label><input type="password" id="pwd" name="pwd"><br>
	성별 : <input type="radio" name="gender" value="여자"> 여자
	<input type="radio" name="gender" value="남자"> 남자 <br>
	
	취미 : <input type="checkbox" name="sport" value="축구"> 축구
	<input type="checkbox" name="sport" value="야구"> 야구
	<input type="checkbox" name="sport" value="농구"> 농구 <br>
	
	색 : <input type="color" name="mycolor"><br>
	<label for="email">이메일 : </label><input type="email" id="email" name="email"><br>
	
	과목 : <select name="subject">
		<option value="java">Java</option>	
		<option value="jsp">JSP</option>
		<option value="html">HTML</option>
	</select><br>
	
	<textarea rows="20" cols="50" name="txt"></textarea><br>
	<input type="submit" value="서버로 제출">
	
</form>
</body>
</html>		    