<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Colored Name</title>
	</head>
	<body>
<c:url var="formAction" value="/colorizedResult" />
<form method="GET" action="${formAction}">
		<h2>Enter Name</h2>
		<div>
		<label for="first">First Name:</label> <br>
		<input type="text" name="first" id="first" />
		</div>
		<div>
		<label for="last">Last Name:</label> <br>
		<input type="text" name="last" id="last" />
		</div>
		
		
		
		<h2>Choose Order</h2>
			<div>
		<input type="checkbox" name="color" value="red"/>
		<label for="red">Red</label>
		</div>
			<div>
		<input type="checkbox" name="color" value="blue"/>
		<label for="blue">Blue</label>
		</div>
			<div>
		<input type="checkbox" name="color" value="green"/>
		<label for="green">Green</label>
		</div>
	
		
		<input type="submit" value="Submit"/>
	</form>
	</body>
</html>