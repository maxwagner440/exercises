<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file = "common/header.jspf" %>


    <section id="main-content">
<h2>Toy Department</h2>
		<section class="flexContainer">


			<c:forEach items="${products}" var="product">
				<div class="recipeHolder flexContainerTile">

					<img src="img/${product.imageName}" class="toyItem2" />
					<div >
						<div>
						<div class="name">
						<c:url var="productD" value="/productDetail?productId=${product.productId}"/>
					<a href= "${productD}"><c:out value="${product.name}" /></a>
					</div>
					<div class="details"><c:out value="${product.manufacturer}" /></div><br><br>
					<div class="details">$<c:out value="${product.price }"/></div>
					<div class="details"><c:out value="${product.weightInLbs }"/></div>
						</div>
						<div class="flexContainerText">
							<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating" />
							<img src="img/${formattedRating}-star.png" class="rating" />
							<c:out value="${recipe.ingredients.size()}" />
							
						</div>
					</div>
				</div>

			</c:forEach>


       
<%@ include file = "common/footer.jspf" %>
