<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>AWWWW YEAAAA SQUIRRELS</title>
	</head>
	<body>
<c:url var="formAction" value="/postOnForum" />
<form method="GET" action="${formAction}">
	<div>
		<c:url var="dummiePic" value="/img/forDummies.png" />
		<img src="${dummiePic}"/>
	</div>
	<div>
		<c:url var="forumUrl" value="/postOnForum" />
		<a href="${forumUrl}">Post a Message</a>
	</div>
	<div>
		<c:forEach items="${reviews}" var="review">
			<div><strong><c:out value="${review.username}"/></strong></div>
			<div>
			<c:url value="img/${review.rating}-star.png" var="rating"/>
			<img src="${rating }"/>
			</div><br>
			<div><c:out value="${review.title}"/></div>
			<div><c:out value="${review.text }" /></div><br>
		</c:forEach>
	</div>

	</form>
	</body>
</html>