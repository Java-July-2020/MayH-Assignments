<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>The Code</title>
	<link rel="stylesheet" href="css/main.css" />
</head>
<body>
	<form action="/attempt" method="post">
		<span><c:out value="${ error }" /></span>
		<input type="text" name="guess" placeholder="What is the code?" />
		<button>Try Code</button>
	</form>
</body>
</html>