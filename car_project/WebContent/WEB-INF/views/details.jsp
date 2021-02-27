<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="css/text" href="css/details.css">
<title>Insert title here</title>
</head>
<body
	style="background-image: url('https://wallpapercave.com/wp/wp4391941.jpg')">
	<br>
	<form action="Details" method="post">
		<table>
			<tr>
				<td><input type="text" name="Model" placeholder="model of car" required><span><input
						type="text"placeholder="date_of_purchase" name="Date_of_purchase" required></span>
						 <span><input type="number" placeholder="price" name="Price" required></span><span>
						<select name="Color"><option value="gold">gold</option>
							<option value="red">red</option>
							<option value="black">black</option>
							<option value="white">white</option>
							<option value="grey">grey</option>
							<option value="orange">orange</option>
							<option value="yellow">yellow</option>
							<option value="silver">silver</option>
							<option value="bronze">bronze</option></select>
				</span>
					<button type="submit">
						search..
					</button></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<p style=color:white><b>Welcome Mr bean</b></p>
	<br>

</body>
</html>