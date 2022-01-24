package ec.edu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "musico")
//Declaracion Named
@NamedQuery(name = "Musico.buscarPorMusica", query = "select m from Musico m where m.musica = :valor")

public class Musico {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_musico"))
	@SequenceGenerator(name = "seq_musico", sequenceName = "seq_musico",allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "musica")
	private String musica;

	// metodos set y get
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

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	@Override
	public String toString() {
		return "Musico [id=" + id + ", nombre=" + nombre + ", musica=" + musica + "]";
	}

}
