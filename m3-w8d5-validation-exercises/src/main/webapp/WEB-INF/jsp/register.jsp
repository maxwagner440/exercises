<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Register"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>
	<c:url var="signUpUrl" value="/register"/>
	<form:form method="POST" action="${signUpUrl}" modelAttribute="register">
<p>
	<div>
			<label for="first">First Name</label>
			<form:input path="first" />
			<form:errors path="first" cssClass="error"/>		
	</div>
	<div>
		<label for="last">Last Name</label>
		<form:input path="last"/><br> 
 		<form:errors path="last" cssClass="error"/> 
	</div>
	<div>
		<label for="email">Email</label>
		<form:input path="email"/><br> 
 		<form:errors path="email" cssClass="error"/> 
	</div>
	<div>
		<label for="confirmE">Confirm Email</label>
		<form:input path="confirmE"/><br> 
 		<form:errors path="confirmE" cssClass="error"/> 
	</div>
	<div>
		<label for="password">Password</label>
		<form:input path="password"/><br> 
 		<form:errors path="password" cssClass="error"/> 
	</div>
	<div>
		<label for="confirmP">Confirm Password</label>
		<form:input path="confirmP"/><br> 
 		<form:errors path="confirmP" cssClass="error"/> 
	</div>
	<div>
		<label for="birthday">Birthday (MM-DD-YYYY)</label>
		<form:input path="birthday"/><br> 
 		<form:errors path="birthday" cssClass="error"/> 
	</div>
	<div>
		<label for="tickets">Number of Tickets</label>
		<form:input path="tickets"/><br> 
 		<form:errors path="tickets" cssClass="error"/> <br>
	</div>
	
		<div>
			<input type="submit" value="Submit"/>
		</div>
	
	
</p>
</form:form>




<%@include file="common/footer.jspf" %>