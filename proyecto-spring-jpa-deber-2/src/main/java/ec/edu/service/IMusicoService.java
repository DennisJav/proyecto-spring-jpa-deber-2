package ec.edu.service;

import java.util.List;

import ec.edu.modelo.Musico;

public interface IMusicoService {
	void guardarMusico(Musico musico);
	void modificarMusico(Musico musico);
	void borrarMusico(Integer id);
	Musico buscarMusico(Integer id);
	Musico buscarMusicoPorMusica(String musica);
	Musico buscarMusicoPorMusicaTyped(String musica);
	Musico buscarMusicoPorMusicaNamed(String musica);
	Musico buscarMusicoPorMusicaNativeQuery(String musica);
	List<Musico> buscarMusicoPorMusicaCriteriaApi(String musica);
}
