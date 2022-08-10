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
		<h1>Send an Omikuji!</h1>
	    <form action='/omikuji/make' method='post'>
	    	<div>
				<label>Pick any number from 5 to 25: </label>
			</div>
		    <div>
			    <input type="number" name='numberYear'>
		    </div>
		    <div>
				<label>Enter the name of any city: </label>
			</div>
		    <div>
			    <input type="text" name='city'>
		    </div>
		    <div>
				<label>Enter the name of any real person:</label>
			</div>
		    <div>
			    <input type='text' name='person'>
		    </div>
		    <div>
			    <label>Enter professional endeavor or hobby:</label>
			</div>
		    <div>
			    <input type='text' name='hobby'>
		    </div>
		    <div>
			    <label>Enter any type of living thing:</label>
			</div>
		    <div>
			    <input type='text' name='livingThing'>
		    </div>
		    <div>
			    <label>Say something nice to someone:</label>
			</div>
		    <div>
			    <input type='text' name='niceThing'>
		    </div>
		    <p>Send and show a friend</p>
		    <div class="butt_cont">
		    	<input class="send_butt" type='submit' value='Send'>
		    </div>
		   
	    </form>
	</div>

</body>
</html>