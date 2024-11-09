package ar.com.educacionit.services;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repositories.ProductoRepository;
import ar.com.educacionit.repository.repositories.impl.ProductoRepositoryMysqlImpl;

public class ProductoServiceImpl implements ProductoService {
	// IMPLEMENTO LOS METODOS DE LA INTERFACE

	// INYECCION DE DEPENDENCIA
	private ProductoRepository repository;
	
	public ProductoServiceImpl() {
		inyectarClases();
	}
	
	private void inyectarClases() {
		this.repository = new ProductoRepositoryMysqlImpl();
	}
	
	@Override
	public ProductoDTO getById(Long id) {

		return this.repository.getById(id);
	}
}
