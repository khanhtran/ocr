<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title><spring:message code="form.addDoctor"/></title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="form.addDoctor"/></h1>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="doctor" class="form-horizontal" action = "admin/doctors/add" method = "POST">
			<fieldset>
				<legend><spring:message code="form.addDoctor"/></legend>
				<div class="form-group form-group-sm">
					<!-- left column -->
            		<div class="col-sm-6">
            			<div class="form-group">
							<label class="control-label col-sm-2" for="firstName"><spring:message code="form.firstName"/></label>
							<div class="col-sm-10">
								<form:input id="firstName" path="firstName" class="form:input-large"/>
								<form:errors path="firstName" cssClass="text-danger"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="firstName"><spring:message code="form.lastName"/></label>
							<div class="col-sm-10">
								<form:input id="lastName" path="lastName" class="form:input-large"/>
								<form:errors path="lastName" cssClass="text-danger"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for=""><spring:message code="form.phone"/></label>
							<div class="col-sm-2">
								<form:input id="area" path="phone.area" class="form:input-large"/>								
							</div>
							<div class="col-sm-2">
								<form:input id="prefix" path="phone.prefix" class="form:input-large"/>								
							</div>
							<div class="col-sm-2">
								<form:input id="number" path="phone.number" class="form:input-large"/>								
							</div>
							<form:errors path="phone.*" cssClass="text-danger"/>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="doctorCategory"><spring:message code="form.doctorCategory"/></label>
							<div class="col-sm-10">
								<form:select id = "doctorCategory" path = "doctorCategory" items="${categories}" itemValue="id" itemLabel="categoryName"/>
							</div>
						</div>
						<p class="lead">Address</p>
						<div class="form-group">
		                    <label for="street" class="col-sm-2 control-label"><spring:message code="form.street"/></label>
		                    <div class="col-sm-10">
		                        <form:input id="street" path = "address.street" class="form-control"/>
		                        <form:errors path="address.street" cssClass="text-danger"/>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <label for="city" class="col-sm-2 control-label"><spring:message code="form.city"/></label>
		                    <div class="col-sm-10">
		                        <form:input id="city" path = "address.city" class="form-control"/>
		                        <form:errors path="adress.city" cssClass="text-danger"/>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <label for="zip" class="col-sm-2 control-label"><spring:message code="form.zip"/></label>
		                    <div class="col-sm-10">
		                        <form:input id="zip" path="address.zip" class="form-control"/>
		                        <form:errors path="address.zip" cssClass="text-danger"/>
		                    </div>
		                </div>
            		</div>
            		<!-- right column -->
            		<div class="col-sm-6">
            			<div class="form-group">
            				<label for="picture"><spring:message
							code="form.picture" /></label>
							<form:input id="picture" path="picture" type="file"/>
            			</div>
            			
            			<div class="form-group">
            				<label for="portfolio"><spring:message
							code="form.portfolio" /></label>
							<form:input id="portfolio" path="portfolio"/>
            			</div>
            			<div class="form-group">
            				<label for="timespans"><spring:message code="form.timespan"/></label>
            				<form:checkboxes items="${timespans}" path="availableTimespans"
                        itemValue="id" itemLabel="value" /></td>
            			</div>
            			<!-- submit -->
            			<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
								<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
							</div>
						</div>		
            		</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>
