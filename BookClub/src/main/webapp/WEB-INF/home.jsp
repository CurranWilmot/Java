<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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
		<h1><c:out value="${user.userName}"/> DID IT WOO!</h1>
		<p>Books from everyone's shelves:</p>
		</div>
		<div class="top-right">
			<a href="/logout">Logout</a>
			<a href="/books/new">+ Add to my shelf!</a>
		</div>
	</div>
	<table>
	    <thead>
	        <tr>
	        	<th>ID</th>
	            <th>Title</th>
	            <th>Author Name</th>
	            <th>Posted By</th>
	        </tr>
	    </thead>
	    <tbody>
	         <c:forEach var="oneBook" items="${books}">
	         <tr>
	         	<td><c:out value="${oneBook.id}"/></td>
	         	<td><a href="/books/${oneBook.id}"><c:out value="${oneBook.title}"/></a></td>
	         	<td><c:out value="${oneBook.authorName}"/></td>
	         	<td><c:out value="${oneBook.user.userName}"/></td>
	         </tr>
	         </c:forEach>
	    </tbody>
    </table>
</body>
</html>