package ec.edu.modelo;

import java.math.BigDecimal;
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
@Table(name = "tarjeta_de_credito")
public class TarjetaDeCredito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_tarjeta"))
	@SequenceGenerator(name = "seq_tarjeta", sequenceName = "seq_tarjeta",allocationSize = 1)
	@Column(name = "tarj_id")
	private Integer id;
	@Column(name = "tarj_numero_tarjeta")
	private String numeroTarjeta;
	@Column(name = "tarj_cedula_propietario")
	private String cedulaPropietario;
	@Column(name = "tarj_cupo")
	private BigDecimal cupo;

	
	@OneToMany(mappedBy = "tarjeta_de_credito", cascade = CascadeType.ALL)
	private List<Consumo> consumostarjeta;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}


	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}


	public String getCedulaPropietario() {
		return cedulaPropietario;
	}


	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}


	public BigDecimal getCupo() {
		return cupo;
	}


	public void setCupo(BigDecimal cupo) {
		this.cupo = cupo;
	}


	public List<Consumo> getConsumostarjeta() {
		return consumostarjeta;
	}


	public void setConsumostarjeta(List<Consumo> consumostarjeta) {
		this.consumostarjeta = consumostarjeta;
	}


	@Override
	public String toString() {
		return "TarjetaDeCredito [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", cedulaPropietario="
				+ cedulaPropietario + ", cupo=" + cupo +  "]";
	}
	
	
	
	
}
