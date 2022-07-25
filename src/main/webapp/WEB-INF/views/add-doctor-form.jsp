<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="adddoctors" method="post" modelAttribute="adddoctor">
				<div>
					<label for="DOC_ID">Doctor Id</label>
					<div>
						<form:input path="DOC_ID" />
					</div>
				</div>
				<div>
					<label for="DOC_NAME">Doctor Name</label>
					<div>
						<form:input path="DOC_NAME" />
					</div>
				</div>
				<div>
					<label for="DOC_DOB">Date Of Birth</label>
					<div>
						<form:input path="DOC_DOB" />
					</div>
				</div>
				<div>
					<label for="DOC_EMIAL">Email</label>
					<div>
						<form:input path="DOC_EMIAL" />
					</div>
				</div>
				<div>
					<label for="SPECIALITY">Speciality</label>
					<div>
						<form:input path="SPECIALITY" />
					</div>
				</div>
				<div>
					<label for="CITY">City</label>
					<div>
						<form:input path="CITY" />
					</div>
				</div>
				<div>
					<label for="PHONE_NO">Phone No</label>
					<div>
						<form:input path="PHONE_NO" />
					</div>
				</div>
				<div>
					<label for="FEE">Standard fee</label>
					<div>
						<form:input path="FEE" />
					</div>
				</div>
				<div>
					<form:button>Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>