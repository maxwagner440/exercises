<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Squirrel Cigar Party</title>
	</head>
	<body>
	<h1>Those Damn Squirrels Are At It AGAIN!</h1><br>
	<div><c:url var="squirrelPic" value="/img/smoking-squirrel.png" />
	<img src="${squirrelPic}" /></div>

<c:url var="formAction" value="/cigarPartyResult" />
<form method="POST" action="${formAction}">

		<div>
		<label for="first">Number of Squirrels:</label> <br>
		<input type="text" name="numOfSquirrels" id="numOfSquirrels" />
		</div>

		<div>
		<input type="checkbox" name="weekend" value="false"/>
		<label for="weekend">Is this the freakin weekend?</label>
		</div>
	
		<input type="submit" value="Submit"/>
	</form>
	</body>
</html>