<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home"/>
<%@include file="common/header.jspf" %>

<h2>Let's See What the Damage is...</h2>

	<c:url var="logUrl" value="/newLog"/>
	<form:form method="POST" action="${loginUrl}" modelAttribute="newLog">
	
	
	</form:form>


<%@include file="common/footer.jspf" %>