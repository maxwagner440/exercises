<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>
<c:url var="formAction" value="/xOrderedResult" />
<form method="GET" action="${formAction}">
		<h2>Enter Name</h2>
		<div>
		<label for="firstName">First Name:</label> <br>
		<input type="text" name="firstName" id="firstName" />
		</div>
		<div>
		<label for="middleName">Middle Name:</label> <br>
		<input type="text" name="middleName" id="middleName" />
		</div>
		<div>
		<label for="lastName">Last Name:</label> <br>
		<input type="text" name="lastName" id="lastName" />
		</div>
		
		
		
		<h2>Choose Order</h2>
			<div>
		<input type="radio" name="order" value="First MI Last"/>
		<label for="First MI Last">First MI Last</label>
		</div>
			<div>
		<input type="radio" name="order" value="First Last"/>
		<label for="First Last">First Last</label>
		</div>
			<div>
		<input type="radio" name="order" value="Last, First MI"/>
		<label for="Last, First MI">Last, First MI</label>
		</div>
			<div>
		<input type="radio" name="order" value="Last, First"/>
		<label for="Last, First">Last, First</label>
		</div>
		
		<input type="submit" value="Submit"/>
	</form>
	</body>
</html>