<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import= "test.Test1"  %>
 <%
 int num = 10;
 String name="솔라";
 for(int i=1; i<5; i++){
	 System.out.println(num);
 }
 
 Test1 test = new Test1("솔라",404);
 
 out.println(test.getName());
 out.println(test.getAge());
 
 %>   
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> <%=num %>  <%=name %> </h1>

</body>
</html>