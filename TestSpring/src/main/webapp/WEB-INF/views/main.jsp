<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원가입 페이지(이름/비밀번호)
	<form:form action="member/join" modelAttribute="memberBean" method="post">
		이름 : <form:input path="user_name"/> <br />
		비밀번호 : <form:password path="user_pass"/> <br />
		<button type="submit">제출</button>
	</form:form>
	
	<a href="goods">상품페이지</a> <br />
	
	<a href="MemberInfo">회원목록페이지</a>
	<a href="GoodsInfo">상품목록페이지</a>
</body>
</html>