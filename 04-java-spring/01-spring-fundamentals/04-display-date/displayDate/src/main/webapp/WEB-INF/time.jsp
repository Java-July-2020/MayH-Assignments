<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/timealert.js"> </script>
</head>
<body>
        <h3 class="time" ><c:out value="${todaysTime}"/></h3>
</body>
</html>