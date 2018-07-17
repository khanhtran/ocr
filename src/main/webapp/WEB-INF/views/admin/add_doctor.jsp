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
		<form:form modelAttribute="doctor" class="form-horizontal" action='add?${_csrf.parameterName}=${_csrf.token}' method = "POST" enctype="multipart/form-data">
			
				<div class="form-group form-group-sm">
					<!-- left column -->
            		<div class="col-sm-6">
            			<div class="form-group">
							<label class="control-label col-sm-4" for="firstName"><spring:message code="form.firstName"/></label>
							<div class="col-sm-8">
								<form:input id="firstName" path="firstName" class="form-control"/>
								<form:errors path="firstName" cssClass="text-danger"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="firstName"><spring:message code="form.lastName"/></label>
							<div class="col-sm-8">
								<form:input id="lastName" path="lastName" class="form-control"/>
								<form:errors path="lastName" cssClass="text-danger"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for=""><spring:message code="form.phone"/></label>
							<div class="col-sm-2">
								<form:input id="area" path="phone.area" class="form-control"/>								
							</div>
							<div class="col-sm-2">
								<form:input id="prefix" path="phone.prefix" class="form-control"/>								
							</div>
							<div class="col-sm-3">
								<form:input id="number" path="phone.number" class="form-control"/>								
							</div>
							<div class="col-sm-2"></div>
						</div>
						<div class="form-group">
							<div class="col-sm-4">&nbsp;</div>
							<div class="col-sm-8">
								<form:errors path="phone.*" cssClass="text-danger"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="doctorCategory"><spring:message code="form.doctorCategory"/></label>
							<div class="col-sm-8">
								<form:select class="form-control" id = "doctorCategory" path = "doctorCategory" items="${categories}" itemValue="id" itemLabel="categoryName"/>
							</div>
							<form:errors path = "doctorCategory" cssClass="text-danger"/>
						</div>
						<p class="lead">Address</p>
						<div class="form-group">
		                    <label for="street" class="col-sm-4 control-label"><spring:message code="form.street"/></label>
		                    <div class="col-sm-8">
		                        <form:input id="street" path = "address.street" class="form-control"/>
		                        <form:errors path="address.street" cssClass="text-danger"/>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <label for="city" class="col-sm-4 control-label"><spring:message code="form.city"/></label>
		                    <div class="col-sm-8">
		                        <form:input id="city" path="address.city" class="form-control"/>
		                        <form:errors path="address.city" cssClass="text-danger"/>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <label for="state" class="col-sm-4 control-label"><spring:message code="form.state"/></label>
		                    <div class="col-sm-8">
		                        <form:input id="state" path="address.state" class="form-control"/>
		                        <form:errors path="address.state" cssClass="text-danger"/>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <label for="zip" class="col-sm-4 control-label"><spring:message code="form.zip"/></label>
		                    <div class="col-sm-8">
		                        <form:input id="zip" path="address.zip" class="form-control"/>
		                        <form:errors path="address.zip" cssClass="text-danger"/>
		                    </div>
		                </div>
		                
            		</div>
            		<!-- right column -->
            		<div class="col-sm-6">
            			<div class="form-group">
            				<label for="picture" class="col-sm-4 control-label"><spring:message
							code="form.picture" /></label>
							<div class="col-sm-8">
							<form:input id="picture" path="picture" type="file" class="form-control"/>
							</div>
            			</div>
            			
            			<div class="form-group">
            				<label for="portfolio" class="col-sm-4 control-label"><spring:message
							code="form.portfolio" /></label>
							<div class="col-sm-8">
								<form:textarea id="portfolio" path="portfolio" class="form-control" type="textarea" cols = "20" rows = "10"/>
								<form:errors path="portfolio" cssClass="text-danger"/>
							</div>
            			</div>
            			<div class="form-group">
            				<label for="timespans" class="col-sm-4 control-label"><spring:message code="form.timespan"/></label>
            				<div class="col-sm-8">
            					<c:forEach items="${timespans}" var="timespan">
								    <div>
								    	<form:checkbox path="availableTimespans" value="${timespan.id}" class="form-check-input"/> ${timespan.value}
								    </div>
								</c:forEach>
								<form:errors path = "availableTimespans" cssClass="text-danger"/>
                        	</div>
            			</div>
            			<!-- submit -->
            			<div class="form-group">
            				<div class="col-sm-4">&nbsp;</div>
							<div class="col-sm-8"">
								<input type="submit" id="btnAdd" class="btn btn-primary" value ="Save Doctor" class="form-control"/>
							</div>
						</div>		
            		</div>
				</div>

		</form:form>
	</section>
</body>
</html>
