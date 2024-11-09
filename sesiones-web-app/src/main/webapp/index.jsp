<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clase 2 - Java WebApi</title>
</head>
<body>
	<!-- ME DA EL NOMBRE DEL CONTEXTO (DINAMICO) -->
	<form
		method="get" 
		action="<%=request.getContextPath()%>/api/producto">
		<input type="hidden" name="id" value="1">
		<button>CONSULTAR</button>
	</form>
</body>
</html>