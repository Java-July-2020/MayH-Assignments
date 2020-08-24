<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Pets</title>
</head>
<body>
	<div class="container">
		<h1>Give your buddy a new toy</h1>
	</div>
	
	<form:form method="POST" action="/toys" modelAttribute="toy">
		<div class="form-group"> 
			<form:label path="pet">Gift This Toy To:</form:label>
			<form:errors path="pet"/>
			<form:select path="pet">
			<c:forEach items="${pets}" var="pet">
				<option value="${pet.id}">${pet.name}</option>
			</c:forEach>
			</form:select>
		</div>
	
		<div class="form-group col-md-9"> 
			<form:label path="name">Name
			<form:errors path="name"/>
			<form:input placeholder="Enter the name of the toy" type="text" path="name"/></form:label>
		</div>
		    
		<div class="form-group col-md-9">
		    <form:label path="price">Price
		    <form:errors path="price"/>
		    <form:input placeholder="Enter price in $00.00 format" type="decimal" path="price"/></form:label>
		</div>
		
		<div class="form-group col-md-9">
			<form:label path="description">Description
		    <form:errors path="description"/>
		    <form:input placeholder="Describe the toy" type="text" path="description"/></form:label>
		</div>
		    
		<button class="btn btn-success" type="submit">Submit</button>
		</form:form>
</body>
</html>