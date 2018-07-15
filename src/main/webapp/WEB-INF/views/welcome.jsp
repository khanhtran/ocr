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
				<h1>${greeting}</h1>
				<p>${tagline}</p>
			</div>

			<div class="container">

				<security:authorize access="isAnonymous()">
					<!-- WHICH ONE? depends on basic form OR CUSTOM -->
					<!--a href="<spring:url value='/spring_security_login' />" class="btn btn-default pull-right"> Login</a-->
					<a href="<spring:url value='/login' />"
						class="btn btn-default pull-right"> Login</a>
				</security:authorize>

				<p>
					<security:authorize access="isAuthenticated()">
						<spring:url value="/dologout" var="logout_url" />
						<form:form action="${logout_url}" class="form-horizontal"
							method="POST">
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<input type="submit" id="btnAdd"
										class="btn btn-danger btn-mini  pull-right" value="Logout" />
								</div>
							</div>
						</form:form>
					</security:authorize>



					<a href="<spring:url value='/employees/list' />"
						class="btn btn-default"> <span
						class="glyphicon-hand-left glyphicon"></span>Make a Medical
						Appointment
					</a>
			</div>
		</div>
	</section>

</body>
</html>
