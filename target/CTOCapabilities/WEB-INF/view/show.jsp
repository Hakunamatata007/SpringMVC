<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.mindtree.entity.EmployeeEntity"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="java.util.List"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Telephone</th>
		</tr>
		<%-- <%Map x = ${listEmployee};%> --%>

		<%-- 	<%int count = eList.size(); %> --%>
		<%
			ArrayList<EmployeeEntity> arr = (ArrayList<EmployeeEntity>) request.getAttribute("listEmployee");
			for (int i = 1; i < arr.size(); i++) {
		%>
		<tr>
			<td><%=arr.get(i).getFirstName()%></td>
			<td><%=arr.get(i).getLastName()%></td>
			<td><%=arr.get(i).getEmail()%></td>
			<td><%=arr.get(i).getTelephone()%></td>
		</tr>
		<%
			}
		%>
		<td>
			<%-- <c:forEach items="${listEmployee}" var="emp">
			<tr>
				<td>${emp.lastname},${emp.firstname}</td>
				<td>${emp.email}</td>
				<td>${emp.telephone}</td>
			</tr>
		</c:forEach> --%>
	</table>
</body>
<script>
	document.getElementById('temp').value = listEmployee;
</script>
</html>