<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품목록 페이지</h2>
	
	<c:forEach var="goods" items="${goodslist}">
		
		<h2>${goods.goodsName}</h2> <br />
		<h2>${goods.goodsPrice}</h2> <br />
		<h2>${goods.goodsStore}</h2>
		
	</c:forEach>

</body>
</html>