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
	<h1>All Books</h1>
	
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="oneBook" items="${books}">
         <tr>
         	<td><a href="/books/${oneBook.id}"><c:out value="${oneBook.title}"/></a></td>
         	<td><a><c:out value="${oneBook.language}"/></a></td>
         	<td><a><c:out value="${oneBook.numberOfPages}"/></a></td>
         </tr>
         </c:forEach>
    </tbody>
</table>
	
</body>
</html>