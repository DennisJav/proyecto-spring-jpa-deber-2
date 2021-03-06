package ec.edu.service;

import ec.edu.modelo.Artista;

public interface IArtistaService {
	void guardarArtista(Artista artista);
	void modificarArtista(Artista artista);
	void borrar(Integer id);
	Artista buscar(Integer id);
	Artista buscarPorApellido(String apellido);
	Artista buscarPorApellidoTyped(String apellido);
	Artista buscarPorApellidoNamed(String apellido);
	Artista buscarPorApellidoNativeQuery(String apellido);
}
