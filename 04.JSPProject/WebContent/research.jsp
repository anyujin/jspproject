<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 

<html>
<head>
		<title>설문조사 결과</title>
		<style type="text/css">
			b {
				font-size: 16pt;	
			}
		</style>
</head>

<body>
<h2>설문 조사 결과</h2>
<hr>
<%	request.setCharacterEncoding("UTF-8");
	
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String[] season = request.getParameterValues("season");
	
	if(gender.equals("남자")){  //페이지 강제로 이동
		response.sendRedirect("http://www.naver.com");	//리다이렉트 방식
	}
	else
		response.sendRedirect("http://www.daum.net");
	
	out.print("이름 : <b>" + name + "</b><br>");
	out.print("성별 : <b>" + gender + "</b><br>");
	out.print("좋아하는 계절 : ");
	if(season == null)
		out.print("선택하세요");
	else	
		/* for(int i=0; i< season.length; i++)
			out.print(season[i] + "<br>");	 */
		for(String s : season)
			out.print("<b>" + s + "</b>");
%>
</body>
</html>		    