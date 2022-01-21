package ec.edu.service;

import ec.edu.modelo.Escritor;

public interface IEscritorService {
	void guardarEscritor(Escritor escritor);
	void modificarEscritor(Escritor escritor);
	void borrarEscritor(Integer id);
	Escritor buscarEscritor(Integer id);
	Escritor buscarEscritorPorNovela(String novela);
}
