<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Post On Forum</title>
	</head>
	<body>
<c:url var="formAction" value="/createPost" />
<form method="POST" action="${formAction}">
	
	<h2>Reviews:</h2>
	
	<div>
		<label for="username">Username:</label> <br>
		<input type="text" name="username" id="username" />
	</div>
	<div>
		<label for="rating">Rating:</label> <br>
		<input type="number" name="rating" id="rating" min=1 max=5/>
	</div>
	<div>
		<label for="title">Review Title:</label> <br>
		<input type="text" name="title" id="title" />
	</div>
	<div>
		<label for="text">Review Text:</label> <br>
		<input type="text" name="text" id="text" />
	</div>


	<input type="submit" value="Submit"/>
	</form>
	</body>
</html>