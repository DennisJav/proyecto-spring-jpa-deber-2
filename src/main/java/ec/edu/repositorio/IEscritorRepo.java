package ec.edu.repositorio;

import ec.edu.modelo.Escritor;

public interface IEscritorRepo {
	void ingresarEscritor(Escritor escritor);
	void actualizarEscritor(Escritor escritor);
	void borrarEscritor(Integer id);
	Escritor buscarEscritor(Integer id);
	Escritor buscarEscritorPorNovela(String novela);
}
