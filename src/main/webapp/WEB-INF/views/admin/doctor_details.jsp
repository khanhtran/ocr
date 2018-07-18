<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="doctordetails" /></title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="doctordetails"/></h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="form-group form-group-sm">	
		<!-- <p><a href="?language=en" >English</a>|<a href="?language=zh_CN">Chinese</a></p> -->
		
			<p>
			<img height="200" src="<spring:url value='/data/doctor_${doctor.id}.png'/>" alt = "Doctor picture"/>
			<p>
			<spring:message code="firstName" />:
			${doctor.firstName}<br />
			<spring:message code="lastName" />:
			${doctor.lastName}<br />
			<spring:message code="form.phone" />:
			${doctor.phone}
			</p>
			
			<a href="<spring:url value='/admin/doctors/list' />"
				class="btn btn-default"><spring:message code="doctorList"/>
			</a>
			<a href="<spring:url value='/admin/doctors/add'/>"
				class="btn btn-default"></span><spring:message code="addMoreDoctor"/>
			</a>
			<a href="<spring:url value='/' />"
						class="btn btn-default"><spring:message code="home"/>
			</a>
			
		</div>
	</section>
</body>
</html>