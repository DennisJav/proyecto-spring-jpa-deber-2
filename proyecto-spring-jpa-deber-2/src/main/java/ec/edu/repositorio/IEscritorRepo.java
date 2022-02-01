package ec.edu.repositorio;

import java.util.List;

import ec.edu.modelo.Escritor;

public interface IEscritorRepo {
	void ingresarEscritor(Escritor escritor);
	void actualizarEscritor(Escritor escritor);
	void borrarEscritor(Integer id);
	Escritor buscarEscritor(Integer id);
	Escritor buscarEscritorPorNovela(String novela);
	Escritor buscarEscritorPorNovelaType(String novela);
	Escritor buscarEscritorPorNovelaNamed(String novela);
	Escritor buscarEscritorPorNovelaNativeQuery(String novela);
	List<Escritor> buscarEscritorPorNovelaCriteriaApi(String novela);
	
	
}
