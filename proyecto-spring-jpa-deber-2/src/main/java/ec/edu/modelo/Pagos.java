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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="pagos")
public class Pagos {


	@Id
	@Column(name="pagos_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pagos") 
	@SequenceGenerator(name = "seq_pagos", sequenceName = "seq_pagos", allocationSize = 1)
	private Integer id;
	
	@Column(name="pagos_fecha_pago")
	private LocalDateTime fechaPago;
	
	@Column(name="pagos_valor_pago")
	private BigDecimal valorPAgo;

	
	//Relaciones
	
	@OneToOne
	@JoinColumn(name="clie_id")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="memb_id")
	private Membresia membresia;

	
	//Metodos set y get
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPAgo() {
		return valorPAgo;
	}

	public void setValorPAgo(BigDecimal valorPAgo) {
		this.valorPAgo = valorPAgo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
	

	
	
	
}
