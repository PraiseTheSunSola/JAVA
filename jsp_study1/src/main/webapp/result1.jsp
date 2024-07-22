<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays"%>
    
    
    
    <%--
    	이름과 국어, 수학, 과학 성적을 받아서 
    	이름 출력하고 
    	평균이 90점 이상이면 참 잘했어요.
    	80점 이상이면 잘했어요.
    	70점 이상이면 노력해라
    	나머지는 이게 점수야! 출력
    
    
    
     --%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String name = request.getParameter("stdName");
		int kor = Integer.parseInt( request.getParameter("kor"));
		int mat = Integer.parseInt( request.getParameter("mat"));
		int sci = Integer.parseInt( request.getParameter("sci"));
		
		int total = kor + mat +sci;
		int avg = total/3;
		
		String print = "이름 : " +name;
		
		if(avg >= 90){
			out.println("참 잘했어요");
		}else if(avg>= 80 ){
			out.println("잘했어요.");
		}else {
			out.println("이게 점수야!");
		}
	%>
	
	
	<%=print %>
	
	<br><br>
	<hr>
	<%@ include file="requestTest2.jsp" %>
	
</body>
</html>