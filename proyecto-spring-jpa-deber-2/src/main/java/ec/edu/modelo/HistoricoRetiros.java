package ec.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "historico_retiros")
public class HistoricoRetiros {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historico_retiros")
	@SequenceGenerator(name = "seq_historico_retiros", sequenceName = "seq_historico_retiros", allocationSize = 1)
	@Column(name = "hire_id")
	private Integer id;

	@Column(name = "hire_monto_retiro")
	private BigDecimal montoRetiro;

	@Column(name = "hire_fecha_retiro", columnDefinition = "TIMESTAMP")
	private LocalDateTime fechaRetiro;

	//Relacion muchas a uno 
	
	@ManyToOne
	@JoinColumn(name = "cuha_id") //Cuenta habiente
	private CuentaHabiente cuentaHabiente;

	@ManyToOne
	@JoinColumn(name = "cuba_id")
	private CuentaBancaria cuentaBancaria;

	
	//Metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}

	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}

	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}

	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	@Override
	public String toString() {
		return "HistoricoRetiros [id=" + id + ", montoRetiro=" + montoRetiro + ", fechaRetiro=" + fechaRetiro + "]";
	}
	
	
	
	
	
}
