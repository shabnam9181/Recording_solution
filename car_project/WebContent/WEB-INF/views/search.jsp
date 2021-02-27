<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search_result</title>
</head>
<body
	style="background-image: url('https://wallpapercave.com/wp/wp4391941.jpg')">
	<br>
<p style=color:white>	<%if(request.getAttribute("msg")!=null)
		out.print(request.getAttribute("msg"));%></p>
		<br>
<table border="1">
<tr style=color:white>
<th>
Company
</th>

<th>
Model
</th>

<th>
Color
</th>

<th>
Date_of_purchase
</th>

<th>
Price
</th>

<th>
Engine_capacity
</th>

<th>
Licence_plate_number
</th>

<th>
Seating_capacity
</th>


</tr>
<%
ResultSet results=(ResultSet)request.getAttribute("result");
while(results.next()){%>
<tr style=color:white>
<td><% out.println(results.getString(1)); %>
</td>

<td>
<%out.println(results.getString(2)); %>
</td>

<td>
<%out.println(results.getString(3)); %>
</td>

<td>
<%out.println(results.getString(4)); %>
</td>

<td>
<%out.println(results.getString(5)); %>
</td>

<td>
<%out.println(results.getString(6)); %>
</td>

<td>
<%out.println(results.getString(7)); %>
</td>

<td>
<% out.println(results.getString(8)); %>
</td>
</tr>
<%} %>
</table>
</body>
</html>