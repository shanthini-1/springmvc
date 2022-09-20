<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Doctor</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="finddoctorbyid">
				<div>
					<label for="DOC_ID">Doctor Id</label>
					<div>
						<form:input path="DOC_ID" readonly="true" />
					</div>
				</div>
				<div>
					<label for="DOC_NAME">Doctor Name</label>
					<div>
						<form:input path="DOC_NAME" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="DOC_DOB">Date Of Birth</label>
					<div>
						<form:input path="DOC_DOB" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="DOC_EMIAL">Email</label>
					<div>
						<form:input path="DOC_EMIAL" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="SPECIALITY">Speciality</label>
					<div>
						<form:input path="SPECIALITY" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="CITY">City</label>
					<div>
						<form:input path="CITY" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="PHONE_NO">Phone No</label>
					<div>
						<form:input path="PHONE_NO" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="FEE">Standard fee</label>
					<div>
						<form:input path="FEE" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div></body>
</html>