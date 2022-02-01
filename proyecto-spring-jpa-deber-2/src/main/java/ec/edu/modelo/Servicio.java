package ec.edu.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio {
	@Id
	@Column(name = "serv_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_servicio"))
	@SequenceGenerator(name = "seq_servicio", sequenceName = "seq_servicio",allocationSize = 1)
	private Integer id;
	
	@Column(name = "serv_nombre")
	private String nombre;
	@Column(name = "serv_numero")
	private String numero;
	@Column(name="serv_fecha")
	private LocalDateTime fecha;
	
	@OneToMany(mappedBy =  "servicio", cascade = CascadeType.ALL)
	private List<DetalleServicio> detalles;
	
	//Metdos set y get

	public List<DetalleServicio> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<DetalleServicio> detalles) {
		this.detalles = detalles;
	}
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Servicio [id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", fecha=" + fecha + ", detalles="
				+ detalles + "]";
	}

	
}
