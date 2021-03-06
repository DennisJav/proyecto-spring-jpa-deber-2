package ec.edu.repositorio;

import java.util.List;

import ec.edu.modelo.Musico;

public interface IMusicoRepo {
	void ingresarMusico(Musico musico);
	void actualizarMusico(Musico musico);
	void borrarMusico(Integer id);
	Musico buscarMusico(Integer id);
	Musico buscarMusicoPorMusica(String musica);
	Musico buscarMusicoPorMusicaType(String musica);
	Musico buscarMusicoPorMusicaNamed(String musica);
	Musico buscarMusicoPorMusicaNativeQuery(String musica);
	List<Musico> buscarMusicoPorMusicaCriteriaApi(String musica);
}
