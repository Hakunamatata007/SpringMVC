<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<form action="add">
		<!-- <div>
	<div>>>>>>>>>>>>>>>>>>>>>>>>>>>> Hello! Please Enter your details :>>>>>>>>>>>>>>>>></div>
	First Name:<input type = "text" name = "firstName"><br>
	Last Name:<input type = "text" name = "lastName"><br>
	Email-ID:<input type = "text" name = "email"><br>
	Telephone:<input type = "text" name = "telephone"><br>
</div> -->
		<div>>>>>>>>>>>>>>>>>>>>>>>>>>>> Hello! Please Enter your
			details:>>>>>>>>>>>>>>>>></div>
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Email-ID</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td><input type="text" name="telephone"></td>
			</tr>
		</table>
		<input type="submit">
	</form>
	<br />
	<form action="list">
		<input type="submit" value="List All Employee">
	</form>
	<br />
	<form action="delete" method="Get">
		<input type="text" name="employeeId"> <input type="submit"
			value="Delete">
	</form>
</body>
</html>
