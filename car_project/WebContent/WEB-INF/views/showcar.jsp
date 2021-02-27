<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
    <%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/table.css">
<title>Insert title here</title>
</head>
<body style="background-image: url('https://i.pinimg.com/originals/6b/f9/da/6bf9daec58db569f442e91e90117d2e4.jpg')">
<table id="customers">
<tr>
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

<th>
Delete
</th>

<th>
Update
</th>
</tr>
<%
ResultSet results=(ResultSet)request.getAttribute("result");
while(results.next()){%>
<tr>
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
<td><a href="Delete?Model=<%=results.getString(2)%>">Delete</a></td>
<td><a href="Update?Date_of_purchase=<%=results.getString(4)%>&Licence_plate_number=<%=results.getString(7)%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>