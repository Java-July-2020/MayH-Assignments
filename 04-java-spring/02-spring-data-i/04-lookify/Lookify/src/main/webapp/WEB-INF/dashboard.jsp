<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Lookify</title>
</head>
<hr>
<a href="/songs/new">Add New</a>
<a href="/search/topTen">Top Songs</a>


<table class="table table-dark">
	<thead>
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${songs}" var="song">
		<tr>
			<td>${song.title}</td>
			<td>${song.rating}</td>
			<td><a href="/songs/${song.id}">Delete</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</html>