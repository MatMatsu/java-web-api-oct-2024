package ar.com.educacionit.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	// PK
	@Id
	// Autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo", length = 6, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "titulo", length = 50, nullable = false)
	private String titulo;
	
	@Column(name = "precio", nullable = false)
	private Float precio;

	public Producto() {
		
	}
	
	public Producto(Long id, String codigo, String titulo, Float precio) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Producto(String codigo, String titulo, Float precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
}
