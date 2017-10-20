<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>

	<h1>Ordered Name</h1>
	
	<div>First Name: <c:out value="${nameOrdered.firstName }"/></div>
	<div>Middle Name: <c:out value="${nameOrdered.middleName }"/></div>
	<div>Last Name: <c:out value="${nameOrdered.lastName }"/></div><br><br>
	
	Ordered: <c:out value="${nameOrdered.finishedName}"/>
	
	</body>
</html>