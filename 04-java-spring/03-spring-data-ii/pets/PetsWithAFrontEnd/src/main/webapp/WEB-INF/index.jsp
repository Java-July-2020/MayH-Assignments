<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Pets</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to Pets Dot Com</h1>
		<div class="flexin">
			<a class="btn btn-success" href="/new">Create a New Pet</a>
			<a class="btn btn-success" href="/toys/new">Give a Toy</a>
		</div>
		<div class="flexin">
			<table class="table">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">Id</th>
			      <th scope="col">Name</th>
			      <th scope="col">Species</th>
			      <th scope="col">Age</th>
			      <th scope="col">City/State</th>
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${pets}" var="pet">
			  	<tr>
			      <td>${pet.id}</td>
			      <td><a href="/${pet.id}">${pet.name}</a></td>
			      <td>${pet.species}</td>
			      <td>${pet.age}</td>
			      <c:choose>
				  <c:when test="${pet.tag != null}">
			      <td>${pet.tag.city}, ${pet.tag.state}</td>
				  </c:when>
				  <c:otherwise>
			      <td><font color="red">Not Registered</font></td>
				  </c:otherwise>
				  </c:choose>
			    </tr>
			  </c:forEach>
			  </tbody>  
			</table>
		</div>
	</div>	
</body>
</html>