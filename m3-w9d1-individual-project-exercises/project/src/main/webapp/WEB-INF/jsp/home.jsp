<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home"/>
<%@include file="common/header.jspf" %>

<h2>Welcome to Max's Gym Simulation</h2>
<div>
<h3>Lets Login First!</h3>
</div>
<c:url var="loginUrl" value="/"/>
<form:form method="POST" action="${loginUrl}" modelAttribute="Verify">
	
	<label for="username">Username:</label>
	<form:input path="username" />
	<form:errors path="username" cssClass="error"/>
	
	<label for="password">Password:</label>
	<form:input path="password"/>
	<form:errors path="password" cssClass="error"/>

	<input type="submit" value="Submit"/>
	
</form:form>

<%@include file="common/footer.jspf" %>