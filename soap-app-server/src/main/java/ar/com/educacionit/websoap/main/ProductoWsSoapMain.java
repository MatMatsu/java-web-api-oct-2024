package ar.com.educacionit.websoap.main;

import ar.com.educacionit.websoap.impl.ProductoWsSoapServiceImpl;
import jakarta.xml.ws.Endpoint;

public class ProductoWsSoapMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/", new ProductoWsSoapServiceImpl());
	}
}
