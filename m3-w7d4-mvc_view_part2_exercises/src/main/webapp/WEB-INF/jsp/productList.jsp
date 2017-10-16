<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file = "common/header.jspf" %>
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
      

<%@ include file = "common/footer.jspf" %>
