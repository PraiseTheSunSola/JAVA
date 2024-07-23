<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3> 점심 정보 입력</h3>
		<form method="post" action="choice.jsp">
			점심 메뉴: <input type="text" name="menu"> <br>
			가격: <input type="number" name="price"> <br>
			식당이름: <input type="text" name="restaurant"> <br>
			<button> 제출</button>
		</form>
</body>
</html>