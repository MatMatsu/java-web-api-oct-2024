package ar.com.educacionit.repository.repositories.impl;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repositories.ProductoRepository;

public class ProductoRepositoryMysqlImpl implements ProductoRepository{
	
	// IMPLEMENTAR TODOS LOS METODOS DE LA INTERFACE
	
	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO getById(Long id) {
		
		// SIMULO QUE OBTENGO LOS DATOS DE LA DB
		Long _id = id;
		String titulo = "Producto simulado desde la DB";
		Double precio = 1500.9d;
		
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
