<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원목록</h2>
	
	<c:forEach var="member" items="${list }">
	
		<h2>${member.user_name }</h2> <br />
		<h2>${member.user_pass }</h2>
	
	</c:forEach>
	
	
</body>
</html>