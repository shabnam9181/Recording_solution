<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/table.css">
</head>
<body style="background-image: url('https://cdn.wallpapersafari.com/74/28/UiGwqx.jpg')">
<P style=color:red><%if(request.getAttribute("msg")!=null)
	out.println(request.getAttribute("msg"));%></P>
<form action="Addcar" method="post">
<table id="customers">
<tr>
<td>Company:<select name="Company">
<option value="jaguar">jaguar</option>
<option value="Honda">honda</option>
<option value="BMW">BMW</option>
<option value="chevrolet">chevrolet</option>
<option value="Hyundai">hyundai</option>
<option value="kia">kia</option>
<option value="nissan">nissan</option>
<option value="ferrari">ferrari</option>
<option value="suzuki">suzuki</option>
<option value="lexus">lexus</option>
<option value="merceds-benz">merceds-benz</option>
<option value="toyota">toyota</option>
<option value="Rolls_Royce">Rolls_Royce</option>
<option value="volkswagen">volkswagen</option>
</select></td>
</tr>
<tr>
<td>
Model:<input type ="text" name="Model">
</td>
</tr>
<tr>
<td>
Color: gold<input type="radio" name="Color" value="gold">
yellow<input type="radio" name="Color" value="yellow">
grey<input type="radio" name="Color" value="grey">
black<input type="radio" name="Color" value="black">
red<input type="radio" name="Color" value="red">
silver<input type="radio" name="Color" value="silver">
white<input type="radio" name="Color" value="white">
bronze<input type="radio" name="Color" value="bronze">
blue<input type="radio" name="Color" value="blue">
orange<input type="radio" name="Color" value="orange">
</td>
</tr>
<tr>
<td>
Date_of_purchase:<input type="text" name="Date_of_purchase">
</td>
</tr>
<tr>
<td>
Price:<input type="number" name="Price">
</td>
</tr>
<tr>
<td>
Engine_Capacity: <input type="text" name="Engine_capacity">
</td>
</tr>
<tr>
<td>
Licence_Plate_Number:<input type="text" name="Licence_plate_number">
</td>
</tr>
<tr>
<td>
Seating_capacity:<select name="Seating_capacity">
<option value="4">4</option>
<option value="6">6</option>
<option value="8">8</option>
<option value="9">9</option>
</select>
</td>
</tr>
</table>
<b><input type="submit" value="add"></b>
</form>
</body>
</html>