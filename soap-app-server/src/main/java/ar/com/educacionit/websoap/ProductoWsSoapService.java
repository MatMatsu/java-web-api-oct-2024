package ar.com.educacionit.websoap;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductoWsSoapService {

	@WebMethod
	public ProductoDTO getProductoById(Long id);
}
