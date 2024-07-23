<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	String select =request.getParameter("select");
%>
    
 <div id="header">
 	<ul id="menuList">
 	<!-- 주소는 그대로두고 파라미터를 이용해서 내용을 바꿔줌  -->
 		<li class="menu"><a href="mainPage.jsp">Home</a></li>
 		<li class="menu">소개</li>
 		<li class="menu">자유게시판</li>
 		<li class="menu<%=select.equals("imageBoard") ? "active":"" %>"><a href="mainPage.jsp?part=imageBoard">이미지게시판</a></li>
 		<li class="menu"><a href="mainPage.jsp?part="notify 신고</li>
 		
 	</ul>
 </div>
 
 <!--part=img가  mainPage.jsp에 들어가는 것  -->