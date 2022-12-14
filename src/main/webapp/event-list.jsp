<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>View All Events</title>
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
<h1>List of All Events:</h1>
<form method ="post" action="navigationServlet">
<table>
	<c:forEach items="${requestScope.allEvents}" var="currentevent">
	<tr>
		<td><input type="radio" name="id" value="${currentevent.eventId}"></td>
		<td>${currentevent.artist}</td>
		<td>${currentevent.concertDate}</td>
		<td>${currentevent.concertTime}</td>
	</tr>
	</c:forEach>
</table>
<input type ="submit" value ="Add Concert" name="doThisToEvent">
<input type ="submit" value ="Delete Concert" name="doThisToEvent">
<input type="submit" value ="Edit Concert" name ="doThisToEvent">
<input type="submit" value = "Add Concert Ticket" name = "doThisToEvent">
<input type="submit" value = "View Tickets for this Concert" name = "doThisToEvent">
<input type="submit" value = "View All Tickets Database" name ="doThisToEvent">
</form>
</body>
</html>