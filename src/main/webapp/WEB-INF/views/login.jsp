<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="jstltag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Auth | Login</title>

<%@include file="base.jsp"%>

</head>
<body>

	<%@include file="navbar.jsp"%>

	<div class="container mt-5">


		${message}

		<form:form id="loginForm" modelAttribute="login" action="loginProcess"
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
			<button type="submit" class="btn btn-primary">Login</button>
		</form:form>
	</div>

</body>
</html>