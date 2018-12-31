<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Employees</title>
</head>
<style>
table {
	padding: 10px;
	border: 3px solid black;
}

td, th {
	padding: 10px;
	border: 2px solid black;
}
</style>
<body>

		<table>
			<thead>
			<th>User Id:</th>
			<th>Password:</th>
			<th>Full Name:</th>
			<th>Email:</th>
			<th>Date of birth:</th>
			<th>Gender:</th>
			<th>Security Question:</th>
			<th>Security Answer:</th>
			</thead>
		
			<tbody>
				<c:forEach var="emp" items="${emp}">
				<tr>
					<td>${emp.username}</td>
					<td>${emp.password}</td>
					<td>${emp.fullName}</td>
					<td>${emp.email}</td>
					<td>${emp.dob}</td>
					<td>${emp.gender}</td>
					<td>${emp.secQuestion}</td>
					<td>${emp.secAnswer}</td>
				</tr>
				</c:forEach>
			</tbody><br>
			<tr>
			<td><a href="indx">Go back to index</a>		
			</td>
			</tr>
		</table>
		
		
</body>
</html>