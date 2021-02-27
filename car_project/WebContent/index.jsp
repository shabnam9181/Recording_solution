<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>Car Details</title>
</head>
<body>

	<div class="bg-img">
		<h1>Login here to record your car details</h1>


		<br> <br>

		<div class="container">
			<form action="Login" method="post">
				<b>Username</b> <input type="text" placeholder="Username Please"
					name="username" required> <b>Password</b> <input
					type="password" placeholder="Enter Password" name="password"
					required>

				<button type="submit" class="buttn">Login</button>

			</form>
			<p style="color: red">
				<b> <%
 	if (request.getAttribute("error") != null)
 		out.println(request.getAttribute("error"));
                                %>
				</b>
			</p>
			<p style="color: red">
				<b> <%
 	if (request.getAttribute("logout") != null)
 		out.println(request.getAttribute("logout"));
 %></b>
			</p>
		</div>

	</div>
</body>
</html>