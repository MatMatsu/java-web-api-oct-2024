package ar.com.educacionit.javawebapi.controllers;
import java.io.IOException;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import jakarta.servlet.ServletException;
// <=8 usar javax.servlet
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1 convierto en WebServlet
@WebServlet("/api/producto")
public class ProductoController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// BUSCA UN PRODUCTO EN LA DB POR SU ID
		
		// OBTENGO EL PARAMETRO DESDE EL REQ
		String id = req.getParameter("id");
		Long idL = Long.parseLong(id);
		
		// INSTANCIO EL SERVICIO
		ProductoService service = new ProductoServiceImpl();
		
		// OBTENGO EL PRODUCTO USANDO EL SERVICIO
		ProductoDTO productoDTO = service.getById(idL);
		
		// PROPIO DE LOS SERVLET, PARA ESCRIBIR EN EL REPORTE
		//resp.getWriter().print(productoDTO.toString());
		
		// GUARDA EN LA SESION EL OBJETO DE LA DB
		req.getSession().setAttribute("PRODUCTO", productoDTO);
		
		// REDIRECT
		getServletContext().getRequestDispatcher("/datos.jsp").forward(req, resp);
	}
}
