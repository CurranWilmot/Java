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
	<h1><c:out value="${expense.expenseName}"/></h1>
	<p><c:out value="${expense.vendorName}"/></p>
	<p><c:out value="$${expense.expenseAmount}"/></p>
	<p><c:out value="${expense.description}"/></p>
	<a href="/expenses">Back to main page</a>
</body>
</html>