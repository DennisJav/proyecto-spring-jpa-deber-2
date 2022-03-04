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
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta_bancaria")
	@SequenceGenerator(name = "seq_cuenta_bancaria", sequenceName = "seq_cuenta_bancaria", allocationSize = 1)
	@Column(name = "cuba_id")
	private Integer id;

	@Column(name = "cuba_numeroCuenta")
	private String numeroCuenta;

	@Column(name = "cuba_saldo")
	private BigDecimal saldo;

	@Column(name = "cuba_tipo")
	private String tipo;

	//Relacion muchos a una (solo hay una cuenta con un num propio)
	
	@ManyToOne
	@JoinColumn(name = "cuha_id")  //cuha de cuenta habiente
	private CuentaHabiente cuentaHabiente;

	//Metodos set y get
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}

	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipo=" + tipo
				+ "]";
	}
	
	
	
	

}
