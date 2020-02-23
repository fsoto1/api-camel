package cl.fsoto.apicamel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase que define la tabla producto
 * @author fsoto1
 *
 */
@Entity
public class Producto extends Info{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	private String nombre;	
	private String img;
	private String descripcion;
	private Integer precio;
	private Double descuento;
	
	public Producto() {
		super();
	}
	public Producto(Long id) {
		super();
		this.id = id;
	}
	public Producto(Long id, String nombre, String img, String descripcion, Integer precio, Double descuento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.img = img;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", img=" + img + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", descuento=" + descuento + "]";
	}	
}
