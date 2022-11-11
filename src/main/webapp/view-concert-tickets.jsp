<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>View All Tickets</title>
</head>
<style>
	form{
		margin:10px;
	}
	
	body{
		background-color:#f0eee9;
	}
</style>
<body>
<h1>Tickets for ${currentEvent.artist}</h1>
<form method ="post" action="navigationServlet">
<table>
	<tr>
	 	<th>Price</th>
	 	<th>Customer Name</th>
	 	<th>Row</th>
	 	<th>Seat Number</th>
	</tr> 	
	<c:forEach items="${requestScope.currentEvent.listOfTickets}" var="currentticket">	
	<tr>
		<td>${currentticket.price}</td>
		<td>${currentticket.customer}</td>
		<td>${currentticket.venueRow}</td>
		<td>${currentticket.seatNumber}</td>
	</tr>
	</c:forEach>
</table>
</form>
<a href="viewAllEventsServlet">Return to Events</a>
</body>
</html>