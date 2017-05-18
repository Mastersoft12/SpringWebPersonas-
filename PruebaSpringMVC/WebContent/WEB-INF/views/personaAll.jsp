<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Personas en la Base de datos</h1>
	<c:forEach items="${PersonaList}" var="persona">

        ${persona.cedula} : ${persona.nombre} : ${persona.apellido} : ${persona.edad} <br />

	</c:forEach>

</body>
</html>