<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>





 <%
 request.setCharacterEncoding("UTF-8");
 %>


<jsp:useBean id="Lunch" class="test.Lunch" />
<jsp:setProperty name="Lunch" property="*" />

<jsp:getProperty property="menu" name="Lunch" />
<jsp:getProperty property="price" name="Lunch" />
<jsp:getProperty property="restaurant" name="Lunch" />




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>