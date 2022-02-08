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
@Table(name = "oficina")
public class Oficina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_oficina"))
	@SequenceGenerator(name = "seq_oficina", sequenceName = "seq_oficina",allocationSize = 1)
	@Column(name="ofi_id")
	private Integer id;
	@Column(name = "ofi_nombre")
	private String nombre;
	@Column(name = "ofi_piso")
	private String piso;
	@Column(name = "ofi_numero")
	private String numero;
	
	@OneToOne(mappedBy = "oficina", cascade = CascadeType.ALL)
	private Jefe jefe;

	
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

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Oficina [id=" + id + ", nombre=" + nombre + ", piso=" + piso + ", numero=" + numero + ", jefe=" + jefe
				+ "]";
	}
	
	
}
