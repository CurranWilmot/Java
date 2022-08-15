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
	<h1>New Dojo</h1>
	<form:form action='/dojos/new' method='post' modelAttribute="dojo">
    	<div>
			<form:label path="name">Name: </form:label>
		</div>
	    <div>
		    <form:input type="text" path='name'/>
	    </div>
	    <div>
	    	<form:errors path="name" class="text-danger"/>
	    </div>
	    
	    <div class="butt_cont">
	    	<input class="send_butt" type='submit' value='Create Dojo'>
	    </div>
	   
    </form:form>
    <a href="/dojos">Back to Dojos</a>
</body>
</html>