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
	<div class="omikuji_container">
		<h1>Here's Your Omikuji!</h1>
		<div class="omikuji_box">
			<p>In <c:out value="${numberYear}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, <c:out value="${hobby}"/> for a living.</p>
			<p>The next time you see a <c:out value="${livingThing}"/>, you will have good luck.</p>
			<p>Also, <c:out value="${niceThing}"/></p>
		</div>
		<a href="/omikuji">Go Back</a>
	</div>
</body>
</html>