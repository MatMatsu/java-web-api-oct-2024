package ar.com.educacionit.repository.dtos;

public class ProductoDTO {
	
	private Long Id;
	private String titulo;
	private Double precio;
	
	public ProductoDTO(Long id, String titulo, Double precio) {
		setId(id);
		setTitulo(titulo);
		setPrecio(precio);
	}

	public void setId(Long id) {
		if (id == null || id < 0) {
			throw new IllegalArgumentException("ID no puede ser nulo ni menor a 0");
		}
		Id = id;
	}

	public void setTitulo(String titulo) {
		if (titulo == null) {
			throw new IllegalArgumentException("El TITULO no puede ser nulo");
		}
		this.titulo = titulo;
	}

	public void setPrecio(Double precio) {
		if (precio == null || precio < 0) {
			throw new IllegalArgumentException("PRECIO no puede ser nulo ni menor a 0");
		}
		this.precio = precio;		
	}

	public Long getId() {
		return Id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "{Id:" + Id + ", titulo:" + titulo + ", precio:" + precio + "}";
	}

	
}
