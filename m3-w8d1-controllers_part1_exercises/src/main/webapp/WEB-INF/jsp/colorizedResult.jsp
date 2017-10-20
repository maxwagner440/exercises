<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Colorized Name</title>
	</head>
	<body>

	<h1>Colorized Name</h1>
	
	<div>First Name: <c:out value="${nameColored.first}"/></div>
	<div>Last Name: <c:out value="${nameColored.last}"/></div>
	
	<div><font color="${nameColored.color}">
	
	<c:out value="${nameColored.first} ${nameColored.last}" />
	</font>
	</div>
	</body>
</html>