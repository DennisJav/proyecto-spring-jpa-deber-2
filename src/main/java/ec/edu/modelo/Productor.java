package ec.edu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productor")
public class Productor {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "productora")
	private String productora;
	
	
	//metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	@Override
	public String toString() {
		return "Productor [id=" + id + ", nombre=" + nombre + ", productora=" + productora + "]";
	}
	
	
}
