package ec.edu.service;

import ec.edu.modelo.Musico;

public interface IMusicoService {
	void guardarMusico(Musico musico);
	void modificarMusico(Musico musico);
	void borrarMusico(Integer id);
	Musico buscarMusico(Integer id);
	Musico buscarMusicoPorMusica(String musica);
}
