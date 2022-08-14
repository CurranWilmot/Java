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
	<h1>Edit Expense</h1>
	<form:form action='/expenses/${expense.id}' method='post' modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
    	<div>
			<form:label path="expenseName">Travel Expense: </form:label>
		</div>
	    <div>
		    <form:input type="text" path='expenseName'/>
	    </div>
	    <div>
	    	<form:errors path="expenseName" class="text-danger"/>
	    </div>
	    <div>
			<form:label path="vendorName">Vendor Name: </form:label>
		</div>
	    <div>
		    <form:input type="text" path='vendorName'/>
	    </div>
	    <div>
	    	<form:errors path="vendorName" class="text-danger"/>
	    </div>
	    <div>
			<form:label path="expenseAmount">Amount: </form:label>
		</div>
	    <div>
		    <form:input type='number' path='expenseAmount'/>
	    </div>
	    <div>
	    	<form:errors path="expenseAmount" class="text-danger"/>
	    </div>
	    <div>
		    <form:label path="description">Description: </form:label>
		</div>
	    <div>
		    <form:input type='textarea' path='description'/>
	    </div>
	    <div>
	    	<form:errors path="description" class="text-danger"/>
	    </div>
	    <div class="butt_cont">
	    	<input class="send_butt" type='submit' value='Update Expense'>
	    </div>
	   
    </form:form>
    <a href="/expenses">Back to main page</a>
</body>
</html>