<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Concert Event</title>
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
<form action="addTicketServlet" method="post">
<h1>Add Tickets</h1>
<h2>Concert:</h2><h2>"${currentEvent.artist}"</h2>
<input type = "hidden" name = "id" value="${currentEvent.id}">
<div><label for="price"> Ticket Price:</label> <input type="text" id="price" name="price"></div>
<br>
<div><label for="customer"> Customer Name: </label><input type ="text" id="customer" name="customer"></div>
<br>
<div><label for="row"> Row: </label><input type ="text" id="row" name="row"></div>
<br>
<div><label for="seat"> Seat Number: </label><input type ="text" id="seat" name="seat"></div>
<br>
 
<input type = "submit" value="Add Ticket" class="btn btn-primary">
<br>
<br>
<br>
<a href="viewAllEventsServlet">Return to Events</a>

</form>
</body>
</html>