<%@page import="ar.com.educacionit.repository.dtos.ProductoDTO" %>
<html>
	<head>
	</head>
	<body>
		<%
			ProductoDTO producto = (ProductoDTO)session.getAttribute("PRODUCTO");
			
		%>
		
		<form>
			<label>ID:</label> <%=producto.getId() %>
			<label>Precio:</label> <%=producto.getPrecio() %>
			<label>T�tulo:</label> <%=producto.getTitulo() %>
		</form>
	</body>
</html>