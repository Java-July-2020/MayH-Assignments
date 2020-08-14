<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Lookify</title>
</head>

<body>
	<div class="container">
		<h1>Top Ten Songs</h1>
		<a class="float-right" href="/dashboard">Dashboard</a>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Rating</th>
					<th>Title</th>
					<th>Artist</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ songs }" var="song">
				<tr>
					<td>${ song.rating }</td>
					<td><a href="/songs/${ song.id }">${ song.title }</a></td>
					<td>${ song.artist}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>