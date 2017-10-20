<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
			 <c:forEach begin="1" end="100" var="num">
			 	<c:set var="listClassAttribute" value=""/>
			 	<c:set var="display" value="${num}"/>
			 	<c:choose>
			 		<c:when test="${num % 15 == 0 }">
			 			<c:set var="listClassAttribute" value="fizzbuzz"/>
			 			<c:set var="display" value="FizzBuzz"/>
			 		</c:when>
			 		<c:when test="${num % 5 == 0 }">
			 			<c:set var="listClassAttribute" value="buzz"/>
			 			<c:set var="display" value="Buzz"/>
			 		</c:when>
			 		<c:when test="${num % 3 == 0 }">
			 			<c:set var="listClassAttribute" value="fizz"/>
			 			<c:set var="display" value="Fizz"/>
			 		</c:when>
			 		<c:otherwise>
			 			<c:set var="listClassAttribute" value="li"/>
			 		</c:otherwise>
			 	</c:choose>
		
			 
			 		

			 		<li class="${listClassAttribute}"><c:out value="${display}"/></li>
			 	
			 </c:forEach>
		</ul>
	</body>
</html>