<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Lookify</title>
</head>
<a href="/dashboard">Dashboard</a>


<c:forEach items="${errors}" var="err">
<p>${err}</p>
</c:forEach>

<form action="/songs" method="POST">
	<div class="form-group">
		<label for="title">Title</label>
		<input type="text" name="title">
	</div>
	<div class="form-group">
		<label for="artist">Artist</label>
		<input type="text" name="artist">
	</div>
	<div class="form-group"> 
		<label for="rating">Rating (1-10)</label>
		<input type="text" name="rating">
	</div>
	<button>Add Song</button>
</form>
</html>