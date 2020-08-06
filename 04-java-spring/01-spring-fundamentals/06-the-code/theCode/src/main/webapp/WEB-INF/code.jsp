<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>The Code</title>
</head>
<body>
	<ul>
	<!-- iterate over the tenets attribute -->
	<c:forEach items="${ tenets }" var="tenet">
		<!--  list out each variable -->
		<li><c:out value="${ tenet }"/></li>	
	</c:forEach>
	</ul>
</body>
</html>