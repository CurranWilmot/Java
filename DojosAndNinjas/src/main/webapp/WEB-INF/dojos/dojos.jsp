<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<h1>All Dojos</h1>
	<c:forEach var="oneDojo" items="${dojos}">
		<div>
			<a href="/dojos/${oneDojo.id}"><c:out value="${oneDojo.name}"/></a>
		</div>
	</c:forEach>
	<div>
		<a href="/dojos/new">Create new Dojo</a>
	</div>
	<div>
		<a href="/ninjas/new">Create new Ninja</a>
	</div>
</body>
</html>