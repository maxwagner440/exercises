<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home"/>
<%@include file="common/header.jspf" %>

<c:url var="newUserUrl" value="/createNewProfile"/>
<form:form method="POST" action="${newUserUrl}" modelAttribute="createNewProfile">
	
	<label for="username">Username:</label>
	<form:input path="username" />
	<form:errors path="username" cssClass="error"/>
	
	<label for="password">Password:</label>
	<form:input path="password"/>
	<form:errors path="password" cssClass="error"/>

	<label for="firstName">First Name:</label>
	<form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"/>
	
	<label for="lastName">Last Name:</label>
	<form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	
	<label for="age">Age:</label>
	<form:input path="age"/>
	<form:errors path="age" cssClass="error"/>
	
	<label for="weightInLbs">Weight(in lbs):</label>
	<form:input path="weightInLbs"/>
	<form:errors path="weightInLbs" cssClass="error"/>
	
	<label for="height">Height(in inches):</label>
	<form:input path="height"/>
	<form:errors path="height" cssClass="error"/>
	
	<label for=isFemale>Gender:</label>
	<form:input path="isFemale"/>
	<form:errors path="isFemale" cssClass="error"/> 
	
	<label for="goalWeightInLbs">Goal Weight(in lbs):</label>
	<form:input path="goalWeightInLbs"/>
	<form:errors path="goalWeightInLbs" cssClass="error"/>
	
	<input type="submit" value="Submit"/>
	
</form:form>

<%@include file="common/footer.jspf" %>
