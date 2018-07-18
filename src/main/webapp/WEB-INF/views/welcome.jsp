<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title><spring:message code="welcome"/></title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container" id="header">
				<h4 style="padding: 6px 12px;" class="pull-right"><a href="?language=en_US">English</a>|<a href="?language=es_ES">Spanish</a></h4>
				<img src="<spring:url value='/resource/images/clinic.png' />" />
				<h1><spring:message code="welcome"/></h1>
				<p></p>
			</div>
			
			<div class="container">
				<security:authorize access="isAnonymous()">
					<a href="<spring:url value='/login' />"
						class="btn btn-default pull-right"><spring:message code="login"/></a>
				</security:authorize>				
				<p>
					<security:authorize access="isAuthenticated()">
						<spring:url value="/dologout" var="logout_url" />
						<form:form action="${logout_url}" class="form-horizontal"
							method="POST">
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<input type="submit" id="btnAdd" 
										class="btn btn-danger btn-mini  pull-right" value="<spring:message code='logout'/>" />
								</div>
							</div>
						</form:form>
					</security:authorize>
				</p>
				<p>
					<a href="<spring:url value='/' />"
						class="btn btn-default"> <span
						class="glyphicon-hand-left glyphicon"></span><spring:message code='makeAppointment'/>
					</a>
				</p>
			</div>
		</div>
	</section>
	<script type="text/javascript"	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
</body>
</html>
