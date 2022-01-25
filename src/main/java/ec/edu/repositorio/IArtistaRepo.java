package ec.edu.repositorio;

import ec.edu.modelo.Artista;


public interface IArtistaRepo {
	void insertarArtista(Artista artista);
	void acctualizarArtista(Artista artista);
	void borrarArtista(Integer id);
	Artista buscarArtista(Integer id);
	Artista buscarPorApellido(String apellido);
	Artista buscarArtistaPorApellidoType(String apellido);
	Artista buscarArtistaPorApellidoNamed(String apellido);
	
	
	
}
