package ec.edu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "escritor")
//Declaracion Named
@NamedQuery(name = "Escritor.buscarPorNovela", query = "select e from Escritor e where e.novela = :valor")
public class Escritor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_escritor"))
	@SequenceGenerator(name = "seq_escritor", sequenceName = "seq_escritor",allocationSize = 1)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "novela")
	private String novela;
	
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
	public String getNovela() {
		return novela;
	}
	public void setNovela(String novela) {
		this.novela = novela;
	}
	@Override
	public String toString() {
		return "Escritor [id=" + id + ", nombre=" + nombre + ", novela=" + novela + "]";
	}
	
	
}
