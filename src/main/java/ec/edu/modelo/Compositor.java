package ec.edu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "compositor")
public class Compositor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_compositor"))
	@SequenceGenerator(name = "seq_compositor", sequenceName = "seq_compositor",allocationSize = 1)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "genero_musical")
	private String genero_musical;
	
	
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
	public String getGenero_musical() {
		return genero_musical;
	}
	public void setGenero_musical(String genero_musical) {
		this.genero_musical = genero_musical;
	}
	@Override
	public String toString() {
		return "Compositor [id=" + id + ", nombre=" + nombre + ", genero_musical=" + genero_musical + "]";
	}
	
	
	
}
