<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Doctor Id</th>
					<th>Doctor Name</th>
					<th>Doctor Dob</th>
					<th>Doctor Email</th>
					<th>Speciality</th>
					<th>City</th>
					<th>Phone Number</th>
					<th>Standard Fee</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="doctor" items="${alldoctors}">
					<tr>
						<td>${doctor.DOC_ID}</td>
						<td>${doctor.DOC_NAME}</td>
						<td>${doctor.DOC_DOB}</td>
						<td>${doctor.DOC_EMIAL}</td>
						<td>${doctor.SPECIALITY}</td>
						<td>${doctor.CITY}</td>
						<td>${doctor.PHONE_NO}</td>
						<td>${doctor.FEE}</td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>