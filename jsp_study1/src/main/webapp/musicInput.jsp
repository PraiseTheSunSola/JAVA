<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	
	<h3> 음악 정보 입력 </h3>
	<form method="post" action="action.jsp">
		음악 제목: <input type="text" name="title"> <br>  <%-- input값 name과 클래스쪽 변수 이름이 똑같아야한다 그래야 액션쪽으로 넘어감 --%>
		가수 : <input type="text" name="singer"> <br>
		발매년도 : <input type="number" name= "year" min="1960" max="2024"> <br>
		<button>등록</button>
	</form>
</body>
</html>