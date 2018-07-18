<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<img src="<spring:url value='/resource/images/clinic.png' />" />
				<h1>
					<spring:message code="admin.welcome" />
				</h1>
			</div>

			<div class="container">
				
				<a href="<spring:url value='/admin/doctors/list' />"
					class="btn btn-default"> <span
					class="glyphicon-hand-right glyphicon"></span><spring:message code="doctorList"/>
				</a>
				
				<a href="<spring:url value='/admin/doctors/add' />"
					class="btn btn-default"> <span
					class="glyphicon-hand-right glyphicon"></span><spring:message code="addNewDoctor"/>
				</a>
				
				<security:authorize access="isAuthenticated()">
					<spring:url value="/dologout" var="logout_url" />
					<a href="javascript: $('#logoutForm').submit();"
					class="btn btn-default"> <span
					class="glyphicon-hand-right glyphicon"></span>Logout
					</a>
					<form:form action="${logout_url}" class="form-horizontal"
						method="POST" id="logoutForm">
					</form:form>
				</security:authorize>
				
			</div>
		</div>
	</section>
	<script type="text/javascript"	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
</body>
</html>
