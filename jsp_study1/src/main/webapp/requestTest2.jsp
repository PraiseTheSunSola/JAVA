<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%-- 
 	
 	학생이름과 국어, 수학, 과학, 성적입력하여 
 	제출버튼 클릭하기
 	전송 페이지 : result1.jsp
 	전송 방식 : get
 	   
    
 --%>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form method="get" action="result1.jsp">
		 이름: <input type="text" name="stdName"> <br>
		 국어: <input type="number" name="kor" > <br> 
		 수학: <input type="number" name="mat" > <br> 
		 과학: <input type="number" name="sci" > <br> 
		 <button> 전송 </button>
		</form>



</body>
</html>