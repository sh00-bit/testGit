<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="Goods/sell" modelAttribute="sellBean" method="get">
	상품이름 : <form:input path="GoodsName"/> 
	상품가격 : <form:input path="GoodsPrice"/>
	판매상점 : <form:input path="GoodsStore"/>
	<button type="submit" >상품등록</button>
	</form:form>
</body>
</html>