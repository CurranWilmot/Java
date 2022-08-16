<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<div class="top-bar">
		<div class="top-left">
		<h1><c:out value="${book.title}"/></h1>
		<p>
			<c:out value="${readerName}"/> read 
			<c:out value="${book.title}"/> by
			<c:out value="${book.authorName}"/>.
		</p>
		</div>
		<div class="top-right">
			<a href="/books">back to the shelves</a>
		</div>
	</div>
	<p>
		Here are <c:out value="${readerName2}"/> thoughts: 
	</p>
	<p><c:out value="${book.thoughts}"/></p>
	
	<a href="/books/edit/${book.id}"><button>Edit</button></a>
</body>
</html>