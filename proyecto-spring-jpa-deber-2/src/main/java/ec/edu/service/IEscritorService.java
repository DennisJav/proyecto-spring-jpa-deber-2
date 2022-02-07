package ec.edu.service;

import java.util.List;

import ec.edu.modelo.Escritor;

public interface IEscritorService {
	void guardarEscritor(Escritor escritor);
	void modificarEscritor(Escritor escritor);
	void borrarEscritor(Integer id);
	Escritor buscarEscritor(Integer id);
	Escritor buscarEscritorPorNovela(String novela);
	Escritor buscarEscritorPorNovelaTyped(String novela);
	Escritor buscarEscritorPorNovelaNamed(String novela);
	Escritor buscarEscritorPorNovelaNativeQuery(String novela);
	List<Escritor> buscarEscritorPorNovelaCriteriaApi(String novela);
}
