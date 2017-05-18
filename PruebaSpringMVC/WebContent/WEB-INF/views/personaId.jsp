<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Persona  de la Base de datos</h1>
      <br>Cedula: ${PersonBD.cedula}, Nombre:${PersonBD.nombre}, Apellido: ${PersonBD.apellido}, Edad: ${PersonBD.edad} <br />

</body>
</html>