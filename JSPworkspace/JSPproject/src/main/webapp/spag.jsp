<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("aa", "hello");
%>
	<%=request.getAttribute("result")%>
	
	${result} 
	${sessionScope.names[1]} 
	${requestScope.notice.title}
	${pageScope.aa}
	${param.accept}
</body>
</html>