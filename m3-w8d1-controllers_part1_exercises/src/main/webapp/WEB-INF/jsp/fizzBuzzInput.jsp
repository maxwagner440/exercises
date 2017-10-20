<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Dirty, Dirty Fizz Buzz</title>
	</head>
	<body>
<c:url var="formAction" value="/fizzBuzzResult" />
<form method="POST" action="${formAction}">
		<h2>FizzBuzz Revisited</h2>
		<div>
		<label for="db1">Divisible By:</label> <br>
		<input type="text" name="db1" id="db1" />
		</div>
		<div>
		<label for="db2">Divisible By:</label> <br>
		<input type="text" name="db2" id="db2" />
		</div>
		<div>
		<label for="AltFizz">Alternate Fizz:</label> <br>
		<input type="text" name="AltFizz" id="AltFizz" />
		</div>
		<div>
		<label for="AltBuzz">Alternate Buzz:</label> <br>
		<input type="text" name="AltBuzz" id="AltBuzz" /><br><br>
		</div>
		
		
		
		<label for="number1">Number 1:</label>
		<input type="text" name="number1" id="number1" /> <br>
		<label for="number2">Number 2:</label> 
		<input type="text" name="number2" id="number2" /><br>
		<label for="number3">Number 3:</label> 
		<input type="text" name="number3" id="number3" /><br>
		<label for="number4">Number 4:</label>
		<input type="text" name="number4" id="number4" /> <br>
		<label for="number5">Number 5:</label> 
		<input type="text" name="number5" id="number5" /><br>
		
		<input type="submit" value="Submit"/>
	</form>
	</body>
</html>