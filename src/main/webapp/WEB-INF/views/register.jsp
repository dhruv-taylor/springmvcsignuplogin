<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="jstltag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Auth | Register</title>

<%@include file="base.jsp"%>

</head>
<body>

	<%@include file="navbar.jsp"%>

	<div class="container mt-3">
		<form:form id="regForm" modelAttribute="user" action="registerProcess"
			method="post">
			<div class="form-group">
				<form:label path="username">Username</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter Username" path="username" id="username"
					name="username" />
			</div>
			<div class="form-group">
				<form:label path="password">Password:</form:label>
				<form:input type="password" class="form-control"
					placeholder="Enter Password" path="password" id="password"
					name="password" />
			</div>
			<div class="form-group">
				<form:label path="firstname">Firstname</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter Firstname" path="firstname" id="firstname"
					name="firstname" />
			</div>
			<div class="form-group">
				<form:label path="lastname">Lastname</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter Lastname" path="lastname" id="lastname"
					name="lastname" />
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label>
				<form:input type="email" class="form-control"
					placeholder="Enter Email" path="email" id="email" name="email" />
			</div>
			<div class="form-group">
				<form:label path="address">Address</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter Address" path="address" id="address"
					name="address" />
			</div>

			<div class="form-group">
				<form:label path="mobile">Mobile</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter Address" path="mobile" id="mobile" name="mobile" />
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>

</body>
</html>