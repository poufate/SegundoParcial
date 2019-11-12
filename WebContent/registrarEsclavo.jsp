<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action="registrar">
 <h1>registro de empleado</h1>
 
       <label >Nombre de Empleado</label>
      <input type="text" id="nombre" name="nombre"  >
      </br>
      <label >Codigo de Empleado</label>
      <input type="text" id="codigo" name="codigo"  >
      </br>
       <label >Cedula de Empleado</label>
      <input type="text" id="cedula" name="cedula"  >
      </br>
       <label >fecha de nacimiento de Empleado</label>
      <input type="date" id="fechanac" name="fechanac"  >
      </br>
       <label >fecha de ingreso de Empleado</label>
      <input type="date" id="fechaing" name="fechaing">
      </br>
        <label >fecha de retiro de Empleado</label>
      <input type="date" id="fecharet" name="fecharet">
      </br>
      <button  type="submit">Registrar!</button>
</form>
</body>
</body>
</html>