<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body
	style="background-image: url('https://wallpapercave.com/wp/wp4391941.jpg')">
	<br>
	<br>
	<p style=color:white><%if (request.getAttribute("update")!=null) 
	out.print(request.getAttribute("update"));%></p>
	<br>
	<form action="Update" method="post" >
  <table>
    <tr style=color:white><td>Date_of_purchase<input type="text" name="Date_of_purchase" value="<%=request.getAttribute("Date_of_purchase")%> " readonly>
   </td></tr>
  <tr style=color:white> <td>Licence_plate_number <input type="text"  name="Licence_plate_number" value="<%=request.getAttribute("Licence_plate_number")%>"  readonly>
   </td></tr><tr style=color:white><td><select name="Color"><option value="gold">gold</option>
							<option value="red">red</option>
							<option value="black">black</option>
							<option value="white">white</option>
							<option value="grey">grey</option>
							<option value="orange">orange</option>
							<option value="yellow">yellow</option>
							<option value="silver">silver</option>
							<option value="bronze">bronze</option></select>
							</td></tr>
    <tr style=color:white><td><input type="submit" value="Update"></td></tr>
    </table>

  </form>

</body>
</html>