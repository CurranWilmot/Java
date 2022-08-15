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
	<h1><c:out value="${dojo.name} Location Ninjas"/></h1>
	<table>
	    <thead>
	        <tr>
	            <th>First Name</th>
	            <th>Last Name</th>
	            <th>Age</th>
	        </tr>
	    </thead>
	    <tbody>
	         <c:forEach var="oneNinja" items="${dojo.ninjas}">
	         <tr>
	         	<td><c:out value="${oneNinja.firstName}"/></td>
	         	<td><c:out value="${oneNinja.lastName}"/></td>
	         	<td><c:out value="${oneNinja.age}"/></td>
	         	
	         </tr>
	         </c:forEach>
	    </tbody>
    </table>
    <a href="/dojos">Back to Dojos</a>
</body>
</html>