package ec.edu.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "egresado")
public class Egresado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_egresado"))
	@SequenceGenerator(name = "seq_egresado", sequenceName = "seq_egresado",allocationSize = 1)
	@Column(name = "egr_id")
	private Integer id;
	@Column(name = "egr_nombre")
	private String nombre;
	@Column(name = "egr_apellido")
	private String apellido;
	@Column(name = "egr_facultad")
	private String facultad;
	
	@OneToOne(mappedBy =  "egresado", cascade = CascadeType.ALL)
	private Tesis tesis;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public Tesis getTesis() {
		return tesis;
	}

	public void setTesis(Tesis tesis) {
		this.tesis = tesis;
	}

	@Override
	public String toString() {
		return "Egresado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", facultad=" + facultad
				+ ", tesis=" + tesis + "]";
	}
	
	
}
