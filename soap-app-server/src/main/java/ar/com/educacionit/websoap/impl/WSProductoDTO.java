package ar.com.educacionit.websoap.impl;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductoDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class WSProductoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public WSProductoDTO() {
		// TODO Auto-generated constructor stub
	}
    public WSProductoDTO(Long id, String titulo, Float precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
	}

	@XmlElement(name = "id")
    private Long id;

    @XmlElement(name = "titulo")
    private String titulo;

    @XmlElement(name = "precio")
    private Float precio;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
    
    
}