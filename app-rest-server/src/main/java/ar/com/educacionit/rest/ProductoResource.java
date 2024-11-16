package ar.com.educacionit.rest;

import java.util.List;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("producto")
@Singleton
public class ProductoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		
		Long id = 1L;
		
		// 1 - SERVICE
		ProductoService productoService = new ProductoServiceImpl();
		
		ProductoDTO dto = productoService.getById(id);
		
		return Response.ok(dto).build();//200
	}
}
