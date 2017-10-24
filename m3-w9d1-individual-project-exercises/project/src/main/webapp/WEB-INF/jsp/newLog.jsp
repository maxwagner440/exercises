<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home"/>
<%@include file="common/header.jspf" %>

<h2>Let's See What the Damage is...</h2>

	<c:url var="logUrl" value="/newLog"/>
	<form:form method="POST" action="${logUrl}" modelAttribute="newLog">
	

	
	<label for="caloriesConsumed">Total Calories Eaten for the Day:</label>
	<form:input path="caloriesConsumed"/>
	<form:errors path="caloriesConsumed" cssClass="error"/>
	
	
	<input type="submit" value="Submit"/>
	
	
	
	
	
	
	
	</form:form>


<%@include file="common/footer.jspf" %>