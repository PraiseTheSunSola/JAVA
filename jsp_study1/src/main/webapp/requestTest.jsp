<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	   String name = request.getParameter("myName");
	   String today = request.getParameter("today");
	   
	   String[] 관심 = request.getParameterValues("interest");
	   
	   
	   
	%>
	
	<div> 이름 : <%=name  %></div>
	<div> 날짜 : <%=today  %></div>
	<div> 관심 : <%=Arrays.toString(관심) %></div>
	<!-- name은 하나에 value가 여러개이니 배열로 가지고 온다.  -->
	
	
</body>
</html>