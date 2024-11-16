package ar.com.educacionit.client;

import com.example.soap.client.ProductoWsSoapService;
import com.example.soap.client.ProductoWsSoapServiceImplService;
import com.example.soap.client.WsProductoDTO;

public class WsSoapClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciamos el cliente
		ProductoWsSoapServiceImplService _service = new ProductoWsSoapServiceImplService();
		//accedemos al port
		ProductoWsSoapService service = _service.getProductoWsSoapServiceImplPort();
		//invocamos uno de los sercicios getProdctoBy
		WsProductoDTO dto = service.getProductoById(5L);
		
		System.out.println(dto.getTitulo());
		System.out.println(dto.getId());
		System.out.println(dto.getPrecio());
	}

}
