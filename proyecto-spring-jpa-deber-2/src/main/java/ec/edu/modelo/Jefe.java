package ec.edu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "jefe")
public class Jefe {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_jefe"))
	@SequenceGenerator(name = "seq_jefe", sequenceName = "seq_jefe",allocationSize = 1)
	@Column(name = "jef_id")
	private Integer id;
	@Column(name = "jef_nombre")
	private String nombre;
	@Column ( name = "jef_apellido")
	private String apellido;
	@Column (name = "jef_departamento")
	private String departamento;
	
	@OneToOne
	@JoinColumn(name = "jef_id_oficina")
	private Oficina oficina;

	//Metodos set y get
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public String toString() {
		return "Jefe [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", departamento=" + departamento
				+ ", oficina=" + oficina + "]";
	}
	
	
	
}
