package ar.com.educacionit.websoap.impl;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import ar.com.educacionit.websoap.ProductoWsSoapService;
import jakarta.jws.WebService;

@WebService(endpointInterface = "ar.com.educacionit.websoap.ProductoWsSoapService")
public class ProductoWsSoapServiceImpl implements ProductoWsSoapService{

	public WSProductoDTO getProductoById(Long id) {
		ProductoService service = new ProductoServiceImpl();
		ProductoDTO dto = service.getById(id);
		return new WSProductoDTO(dto.getId(), dto.getTitulo(), dto.getPrecio());
	}
}
