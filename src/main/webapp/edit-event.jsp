<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Event</title>
<style>
	form{
		margin:10px;
	}
	
	body{
		background-color:#f0eee9;
	}

</style>
</head>
<body>
<div class="container">
<h2>Edit Event </h2>
<br />
<form action = "editEventServlet" method="post">
<div>
<input type = "hidden" name = "id" value="${eventToEdit.eventId}">
<div><label for="artist"> Artist:</label> <input type="text" id="artist" name="artist" value= "${eventToEdit.artist}"></div>
<br>
<div><label>Current Concert Date: </label>
	<p>"${eventToEdit.concertDate}"</p>
</div>
<br>
<div><label for="concertDate"> New Concert Date:</label> 
		<input type ="text" name ="month" placeholder="Month" size="4"> 
		<input type ="text" name ="day" placeholder="Day" size="4">, 
		<input type ="text" name ="year" placeholder="Year" size="4"></div>
<br>
<div><label>Current Concert Time: </label>
	<p>"${eventToEdit.concertTime}"</p>
</div>
<br>
<div><label for="concertTime"> New Concert Time:</label> 
		<input type ="text" name ="hour" placeholder="Hour" size="4">, 
		<input type ="text" name ="minutes" placeholder="Minutes" size="4">
</div>
<br>
<input type = "submit" value="Edit Event" class="btn btn-primary">
<br>
<br>
<br>
</div>
</form>
</div>
</body>
</html>