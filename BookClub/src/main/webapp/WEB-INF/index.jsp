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
	<h1>Welcome!</h1>
	<p>Join our growing community</p>
	<div class="main-body">
		<div class="half-body">
			<h1>Register</h1>
			<form:form action='/register' method='post' modelAttribute="newUser">
	    	<div>
				<form:label path="userName">User Name: </form:label>
			</div>
		    <div>
			    <form:input type="text" path='userName'/>
		    </div>
		    <div>
		    	<form:errors path="userName" class="text-danger"/>
		    </div>
		    <div>
				<form:label path="email">Email: </form:label>
			</div>
		    <div>
			    <form:input type="text" path='email'/>
		    </div>
		    <div>
		    	<form:errors path="email" class="text-danger"/>
		    </div>
		    <div>
				<form:label path="password">Password: </form:label>
			</div>
		    <div>
			    <form:input type='password' path='password'/>
		    </div>
		    <div>
		    	<form:errors path="password" class="text-danger"/>
		    </div>
		    <div>
			    <form:label path="confirm">Confirm Password: </form:label>
			</div>
		    <div>
			    <form:input type='password' path='confirm'/>
		    </div>
		    <div>
		    	<form:errors path="confirm" class="text-danger"/>
		    </div>
		    <div class="butt_cont">
		    	<input class="send_butt" type='submit' value='Register'>
		    </div>
		   
	    </form:form>		
		</div>
		<div class="half-body">
			<h1>Login</h1>
			<form:form action='/login' method='post' modelAttribute="newLogin">
	    	<div>
				<form:label path="email">Email: </form:label>
			</div>
		    <div>
			    <form:input type="text" path='email'/>
		    </div>
		    <div>
		    	<form:errors path="email" class="text-danger"/>
		    </div>
		    <div>
				<form:label path="password">Password: </form:label>
			</div>
		    <div>
			    <form:input type="password" path='password'/>
		    </div>
		    <div>
		    	<form:errors path="password" class="text-danger"/>
		    </div>
		    
		    <div class="butt_cont">
		    	<input class="send_butt" type='submit' value='Login'>
		    </div>
		   
	    </form:form>
		</div>
	</div>
</body>
</html>