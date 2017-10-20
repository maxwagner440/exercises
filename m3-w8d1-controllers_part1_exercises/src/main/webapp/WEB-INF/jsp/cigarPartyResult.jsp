<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Squirrel Cigar Party</title>
	</head>
	<body>
	
	<c:choose>
		<c:when test="${sp.judgeParty() == false}" >
			<h3>GREAT PARTY</h3>
			<img src="img/happy-squirrel.png"/>
		</c:when>
		<c:when test="${sp.judgeParty() == true }">
			<h2>Ugh!!!</h2>
			<img src="img/sad-squirrel.png"/>
		</c:when>
	</c:choose>
	
	
	</body>
</html>