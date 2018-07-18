<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="doctorList" /></title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>
<link rel="stylesheet" 
	href="<spring:url value='/resource/css/style.css'/>"/>

</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="doctorList"/></h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="form-group form-group-sm">
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th><spring:message code = "name"/></th>
						<th><spring:message code = "form.phone"/></th>
						<th><spring:message code = "form.category"/></th>
						<th><spring:message code = "form.picture"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items = "${doctors}" var = "doctor">
						<tr>
							<td>${doctor.id}</td>
							<td>${doctor.fullName}</td>
							<td>${doctor.phone}</td>
							<td>${doctor.doctorCategory.categoryName}</td>
							<td><img height="150" src="<spring:url value='/data/doctor_${doctor.id}.png'/>" alt = "Doctor picture"/></td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="5">
							<a href="<spring:url value='/admin/doctors/add'/>" class="btn btn-default"><spring:message code="addMoreDoctor"/></a>
							<a href="<spring:url value='/' />" class="btn btn-default"><spring:message code="home"/></a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>