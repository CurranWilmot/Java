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
	<h1>New Ninja</h1>
	<form:form action='/ninjas/new' method='post' modelAttribute="ninja">
	    	<div>
				<form:label path="dojo">Dojo: </form:label>
			</div>
		    <div>
			    <form:select path='dojo'>
			    <c:forEach var="oneDojo" items="${dojos}">
					<form:option value="${oneDojo.id}"><c:out value="${oneDojo.name}"/></form:option>
				</c:forEach>
				</form:select>
		    </div>
		    <div>
		    	<form:errors path="dojo" class="text-danger"/>
		    </div>
		    <div>
				<form:label path="firstName">First Name: </form:label>
			</div>
		    <div>
			    <form:input type="text" path='firstName'/>
		    </div>
		    <div>
		    	<form:errors path="firstName" class="text-danger"/>
		    </div>
		    <div>
				<form:label path="lastName">Last Name: </form:label>
			</div>
		    <div>
			    <form:input type='text' path='lastName'/>
		    </div>
		    <div>
		    	<form:errors path="lastName" class="text-danger"/>
		    </div>
		    <div>
			    <form:label path="age">Age: </form:label>
			</div>
		    <div>
			    <form:input type='number' path='age'/>
		    </div>
		    <div>
		    	<form:errors path="age" class="text-danger"/>
		    </div>
		    <div class="butt_cont">
		    	<input class="send_butt" type='submit' value='Add Ninja'>
		    </div>
		   
	    </form:form>
	    <a href="/dojos">Back to Dojos</a>
</body>
</html>