<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Dojo Survey Results</title>
</head>
<body>
	<c:set var="result" value="${ result }"/>
	<h1>Submitted Info</h1>
	<h3>Welcome to Java Fan Club! :)</h3>
	<p><strong>Name:</strong> <c:out value="${ result.getName() }"/></p>
	<p><strong>Language:</strong> <c:out value="${ result.getLanguage() }"/></p>
	<p><strong>Location:</strong> <c:out value="${ result.getLocation() }"/></p>
	<p><strong>Comment:</strong> <c:out value="${ result.getComment() }"/></p>
</body>
</html>