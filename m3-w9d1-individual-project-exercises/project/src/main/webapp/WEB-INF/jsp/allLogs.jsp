<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="pageTitle" value="Home"/>
<%@include file="common/header.jspf" %>

<h2>Past Logs</h2>

	<c:url var="logUrl" value="/allLogs"/>
	<form:form method="GET" action="${logUrl}" modelAttribute="allLogs">
	
	<c:forEach items="${allClients}" var="client">
		<div>
			<c:out value="${client.username}"/>
		</div>
	</c:forEach>
	
	<c:forEach items="${allInput}" var="consume"> 
		<div>
	    <div><strong>Date: </strong><fmt:formatDate type = "date" value="${consume.date }"/></div>
		<div>You consumed <c:out value="${consume.caloriesConsumed}"/> Calories<br></div>
		<div>You needed <c:out value="${consume.caloriesNeeded }"/> Calories <br></div>
		<div>
		<c:choose>
			<c:when test="${consume.caloriesConsumed > consume.caloriesNeeded}">
				<strong>You are over your daily Calories by: <c:out value="${consume.caloriesConsumed - consume.caloriesNeeded}"/> Calories</strong>
			</c:when>
			<c:otherwise>
				<strong>You are under your daily Calories by: <c:out value="${consume.caloriesNeeded - consume.caloriesConsumed}"/> Calories</strong>
			</c:otherwise>
		</c:choose>
		</div>
		</div><br><br>
	</c:forEach>
	
	
	
	</form:form>


<%@include file="common/footer.jspf" %>