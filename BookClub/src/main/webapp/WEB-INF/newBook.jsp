<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
			<h1>Add a book to your shelf!</h1>
		</div>
		<div class="top-right">
			<a href="/books">back to the shelves</a>
		</div>
	</div>
	<form:form action='/books/new' method='post' modelAttribute="book">
		<input type="hidden" name="user" value="${userId}">
    	<div>
			<form:label path="title">Title: </form:label>
		</div>
	    <div>
		    <form:input type="text" path='title'/>
	    </div>
	    <div>
	    	<form:errors path="title" class="text-danger"/>
	    </div>
	    <div>
			<form:label path="authorName">Author: </form:label>
		</div>
	    <div>
		    <form:input type="text" path='authorName'/>
	    </div>
	    <div>
	    	<form:errors path="authorName" class="text-danger"/>
	    </div>
	    <div>
			<form:label path="thoughts">My thoughts: </form:label>
		</div>
	    <div>
		    <form:input type='text' path='thoughts'/>
	    </div>
	    <div>
	    	<form:errors path="thoughts" class="text-danger"/>
	    </div>
	   
	    <div class="butt_cont">
	    	<input class="send_butt" type='submit' value='Add Book'>
	    </div>
	   
    </form:form>
</body>
</html>