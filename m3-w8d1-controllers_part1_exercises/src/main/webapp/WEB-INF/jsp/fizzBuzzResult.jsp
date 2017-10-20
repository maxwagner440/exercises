<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Dirty, Dirty Fizz Buzz</title>
	</head>
	<body>
	<div>
	Divisable By: <c:out value="${theFizz.db1 }"/>
	</div>
	<div>
	Divisable By: <c:out value="${theFizz.db2 }"/>
	</div>
	<div>
	Alternative Fizz: <c:out value="${theFizz.altFizz}"/>
	</div>
	<div>
	Alternative Buzz: <c:out value="${theFizz.altBuzz }"/>
	</div><br>
	<c:out value="${theFizz.getCorrectOrder(theFizz.number1)}"/><br>
	<c:out value="${theFizz.getCorrectOrder(theFizz.number2)}"/><br>
	<c:out value="${theFizz.getCorrectOrder(theFizz.number3)}"/><br>
	<c:out value="${theFizz.getCorrectOrder(theFizz.number4)}"/><br>
	<c:out value="${theFizz.getCorrectOrder(theFizz.number5)}"/><br>
		
	</body>
</html>