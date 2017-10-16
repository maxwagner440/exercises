<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file = "common/header.jspf" %>

<section id="main-content">
<h2>Toy Department</h2>
	<section class="flexContainer2">

			<table id="recipeTable">
			<tr>
				<th>&nbsp; </th>
				<c:forEach items="${products}" var="product">
					<c:url var="productI" value="/productDetail?productId=${product.productId}"/>
					<td><a href= "${productI}"><img src="img/${product.imageName}" class="toyItem"/></a></td>
				</c:forEach>
			</tr>
				
			<tr class="greySpace">
				<th>Name </th>
					<c:forEach items="${products}" var="product">
						<td><c:out value="${product.name}" /></td>
					</c:forEach>
				</tr>
				<tr>
				<th>Rating</th>
					<c:forEach items="${products}" var="product">
						<td><fmt:formatNumber  maxFractionDigits="0" value="${product.averageRating}" var="formattedRating" />
						<img src="img/${formattedRating}-star.png" class="rating"/></td>
						</c:forEach>
				</tr>
				<tr class="greySpace">
				<th>Mfr</th>
					<c:forEach items="${products}" var="product">
						<td><c:out value="${product.manufacturer}" /></td>
					</c:forEach>
				</tr>
				<tr>
				<th>Price</th>
					<c:forEach items="${products}" var="product">
						<td>$<c:out value="${product.price}" /></td>
					</c:forEach>
				</tr>
				<tr class="greySpace">
				<th>Wt. (in lbs.)</th>
					<c:forEach items="${products}" var="product">
						<td><c:out value="${product.weightInLbs}" />
						</td>
					</c:forEach>
				</tr>
				</table>
       

<%@ include file = "common/footer.jspf" %>
