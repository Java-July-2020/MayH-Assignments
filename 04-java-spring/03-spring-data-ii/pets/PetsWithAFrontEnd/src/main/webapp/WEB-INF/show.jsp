<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Pets</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${pet.name}"/>'s Details</h1>
	</div>
	
	<h2>Name:</h2>
	<p>${pet.name}</p>
	<h2>Species:</h2>
	<p>${pet.species}</p>
	<h2>Age:</h2>
	<p>${pet.age}</p>
	
	<h2>Toys:</h2>
	<c:choose>
	<c:when test="${pet.toys != null}">
	<ol>
	<c:forEach items="${pet.toys}" var="toy">
		<li>${toy.name} (${toy.price})</li>
	</c:forEach>
	</ol>
	</c:when>
	<c:otherwise>
	<p>This pet has no toys, gift them one!</p>
	</c:otherwise>
	</c:choose>
	
	<c:choose>
	<c:when test="${pet.tag != null}">
	<h2>City:</h2>
	<p>${pet.tag.city}</p>
	<h2>State:</h2>
	<p>${pet.tag.state}</p>
	</c:when>
	<c:otherwise>
	
	<h4>Register City/State for <c:out value="${pet.name}"/></h4>
	<form:form method="POST" action="/tag" modelAttribute="tag">
		<form:hidden path="pet" value="${pet.id}" />
		<p> 
			<form:label path="city">City
			<form:errors path="city"/>
			<form:input placeholder="Enter a city" type="text" path="city"/></form:label>
		</p>
		    
		<p>
			<form:label path="state">State
		    <form:errors path="state"/>
		    <form:input placeholder="Enter a state" type="text" path="state"/></form:label>
		</p>
		<button class="btn btn-success" type="submit">Add City/State</button>
	</form:form>
	</c:otherwise>
	</c:choose>
	
	<h4>Edit Pet Details</h4>
	<form:form method="POST" action="/${pet.id}" modelAttribute="pet">
	<input type="hidden" name="_method" value="put">
		<p> 
			<form:label path="name">Name
			<form:errors path="name"/>
			<form:input placeholder="Update Name" type="text" path="name"/></form:label>
		</p>
		    
		<p>
			<form:label path="species">Species
		    <form:errors path="species"/>
		    <form:input placeholder="Update Species" type="text" path="species"/></form:label>
		</p>
		
		<p>
			<form:label path="age">Age
		    <form:errors path="age"/>
		    <form:input placeholder="Update Age" type="number" path="age"/></form:label>
		</p>
		<button class="btn btn-success" type="submit">Update</button>
	</form:form>
	
	</body>
</html>