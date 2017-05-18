<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Registrar Persona</h1>
     <form method="post">
     Cedula: <input type="text" name="cedula"/><br/>
     Nombre: <input type="text" name="nombre"/><br/>
     Apellido: <input type="text" name="apellido"/><br/>
     Edad: <input type="text" name="edad"/><br/>
     <input type="submit" value="registrar"/>
     </form>

</body>
</html>