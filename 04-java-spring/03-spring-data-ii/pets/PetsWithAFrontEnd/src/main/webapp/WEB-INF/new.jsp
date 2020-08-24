<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Pets</title>
</head>
<body>
	<div class="container">
		<h1>Register a new pet</h1>
	</div>
	<form:form method="POST" action="/" modelAttribute="pet">
		<div class="form-group col-md-9"> 
			<form:label path="name">Name
			<form:errors path="name"/>
			<form:input placeholder="Enter a name between 1-15 characters" type="text" path="name"/></form:label>
		</div>
		    
		<div class="form-group col-md-9">
			<form:label path="species">Species
		    <form:errors path="species"/>
		    <form:input placeholder="Enter a name between 1-15 characters" type="text" path="species"/></form:label>
		</div>
		    
		<div class="form-group col-md-9">
		    <form:label path="age">Age
		    <form:errors path="age"/>
		    <form:input placeholder="Enter a number" type="number" path="age"/></form:label>
		</div>
		    
		<button class="btn btn-success" type="submit">Submit</button>
		</form:form>
</body>
</html>