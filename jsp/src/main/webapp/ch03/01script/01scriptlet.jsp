<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스크립트릿(scriptlet)</h1>
	<h2>책 65쪽</h2>
	<%
	//자바코드로 변경됨!!
	String b = "hi";
	%>
	java코드 작성<br>
	1. 스크립트릿 scriptlet<br>
	2. 표현식 expression<br>
	3. 선언부 declaration<br>
	
	<p>자바코드 작성가능</p>
	<%
	String a = "hello web app";
	/* out.println("<h1>"); */
	out.println("<h1>"+a+"</h1>");
	/* out.println("</h1>"); */
	%>
</body>
</html>