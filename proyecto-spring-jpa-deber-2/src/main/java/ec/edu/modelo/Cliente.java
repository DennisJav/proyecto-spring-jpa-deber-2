package ec.edu.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@Column(name="clie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente") 
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
	private Integer id;
	
	@Column(name="clie_nombre")
	private String nombre;
	
	@Column(name="clie_apellido")
	private String apellido;
	
	@Column(name="clie_cedula")
	private String cedula;
	
	@Column(name="clie_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@Column(name="clie_estado")
	private String estado;
	
	//relaciones
	
	@ManyToOne
	@JoinColumn(name="memb_id")
	private Membresia membresia;
	
	@OneToOne(mappedBy = "cliente",cascade = CascadeType.ALL)
	private Pagos registroPagos;

	
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}

	public Pagos getRegistroPagos() {
		return registroPagos;
	}

	public void setRegistroPagos(Pagos registroPagos) {
		this.registroPagos = registroPagos;
	}
	
	
	
	
	
	
}
