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
@Table(name = "tesis")
public class Tesis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_tesis"))
	@SequenceGenerator(name = "seq_tesis", sequenceName = "seq_tesis",allocationSize = 1)
	@Column(name = "tes_id")
	private Integer id;
	@Column(name = "tes_titulo")
	private String titulo;
	@Column(name = "tes_facultad")
	private String facultad;
	@Column(name = "tes_autor")
	private String autor;
	
	@OneToOne
	@JoinColumn(name = "tes_id_egresado")
	private Egresado egresado;

	
	//Metodos set y get
	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getFacultad() {
		return facultad;
	}




	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public Egresado getEgresado() {
		return egresado;
	}




	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}




	@Override
	public String toString() {
		return "Tesis [id=" + id + ", titulo=" + titulo + ", facultad=" + facultad + ", autor=" + autor + ", egresado="
				+ egresado + "]";
	}
	
	
	
	
}
