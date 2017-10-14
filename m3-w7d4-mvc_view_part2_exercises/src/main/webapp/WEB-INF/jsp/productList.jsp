<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">

		<c:forEach items="${products}" var="product">
		<div class="container-format">
			<div class="pic-format">
			<img src="img/${product.imageName}">
			</div>
		<div>
			<c:out value="${product.name}"/>
			<c:out value="${product.manufacturer}"/>
			<c:out value="${product.price }"/>
			<c:out value="${product.weightInLbs }"/>
			<c:out value="${product.averageRating }"/>
		</div>
		
 	</div>
		</c:forEach> 
      

    </section>
</body>
</html>