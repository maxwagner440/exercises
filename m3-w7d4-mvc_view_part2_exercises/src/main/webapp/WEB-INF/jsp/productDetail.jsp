<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file = "common/header.jspf" %>

<table>
	<tr class="img-align">
		<td><c:url var="productD" value="/img/${product.imageName}" /> 
		<img src="${productD}" />

		</td>
		<td class="font-adjust"><div class="within"><c:out value="${product.name}" /></div>
		<div class="type"><c:out value="${product.manufacturer }"/></div>
		<div><fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating" />
		<img src="img/${formattedRating}-star.png" class="rating" /></div>
		<div class="type"> $<c:out value="${product.price}" /><br><br> </div>
		<div class="larger">  <strong>Weight: </strong><c:out value="${product.weightInLbs }" /><br><br> </div>
		<div class="type"> <c:out value="${product.description }" /></div></td>
	</tr>
</table>
<p>

</p>




<%@ include file = "common/footer.jspf" %>