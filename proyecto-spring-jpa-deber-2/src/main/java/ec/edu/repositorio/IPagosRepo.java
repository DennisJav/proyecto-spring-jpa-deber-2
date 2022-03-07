package ec.edu.repositorio;

import ec.edu.modelo.Pagos;

public interface IPagosRepo {
	
	void insertar(Pagos pagos);
	
	Pagos buscar(Integer id);
	
	void actualizar(Pagos pagos);
	
	void eliminar(Integer id);
}
