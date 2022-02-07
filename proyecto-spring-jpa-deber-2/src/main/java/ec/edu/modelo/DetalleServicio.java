package ec.edu.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_servicio")
public class DetalleServicio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_detalle_servicio"))
	@SequenceGenerator(name = "seq_detalle_servicio", sequenceName = "seq_detalle_servicio",allocationSize = 1)
	@Column(name = "dese_id")
	private Integer id;
	
	@Column(name = "dese_precio")
	private BigDecimal precio;
	
	@Column(name="dese_equipo")
	private String equipo;
	
	@Column(name = "dese_error")
	private String error;
	
	@ManyToOne
	@JoinColumn(name = "serv_id")
	private Servicio servicio;
	
	
	
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "DetalleServicio [id=" + id + ", precio=" + precio + ", equipo=" + equipo + ", error=" + error
				+ ", servicio=" + servicio + "]";
	}
	
	
	
}
