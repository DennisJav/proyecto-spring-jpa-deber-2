package ec.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//
@Entity
@Table(name = "factura_electronica")

public class FacturaElectronica {

	@Id
	@Column(name = "fact_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fact_electronica")
	@SequenceGenerator(name = "seq_fact_electronica", sequenceName = "seq_fact_electronica", allocationSize = 1)
	private Integer id;

	@Column(name = "fact_cedula_cliente")
	private String cedulaCliente;

	@Column(name = "fact_fecha_Pago")
	private LocalDateTime fechaPago;

	@Column(name = "fact_valor_pago")
	private BigDecimal valorPago;

	
	//Metdos set y get
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
	
	
	
	

}
