<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>
	<c:url var="loginUrl" value="/signIn"/>
	<form:form method="POST" action="${loginUrl}" modelAttribute="signIn">
<p>
	<div>
			<label for="email">Email Address</label>
			<form:input path="email" />
	 		<form:errors path="email" cssClass="error"/>		
			</div>
	<div>
		<label for="password">Password</label>
		<form:input path="password"/><br> 
		<form:errors path="password" cssClass="error"/> <br>
		</div>
	
		<div>
		
			<input type="submit" value="Submit"/>
		</div>
	
	
</p>
</form:form>


<%@include file="common/footer.jspf" %>
