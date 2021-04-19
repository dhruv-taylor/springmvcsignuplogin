<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="jstltag.jsp"%>	
<c:if test="${sessionScope.userId == null}">
	<%
	String redirectURL = "/";
	response.sendRedirect(redirectURL);
	%>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Auth | Dashboard</title>
<%@include file="base.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<div class="container mt-3">

		<c:if test="${sessionScope.userId != null}">
			<h5>Successfully Login</h5>
		</c:if>

		<h4 style="color: orange">Hellow ${username}</h4>

	</div>
</body>
</html>