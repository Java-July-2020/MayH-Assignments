<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<title>Lookify</title>
</head>
<body>
	<div class="container">
		<a class="float-right" href="/dashboard">Dashboard</a>
		<h3>Song Title</h3>
		<p>${ song.title }</p>
		<h3>Artist</h3>
		<p>${ song.artist }</p>
		<h3>Rating</h3>
		<p>${ song.rating }</p>
		<form action="/songs/${ song.id }" method="post">
			<input type="hidden" name="_method" value="delete">
			<input class="btn btn-danger" type="submit" value="Delete">
		</form>
	</div>
</body>
</html>