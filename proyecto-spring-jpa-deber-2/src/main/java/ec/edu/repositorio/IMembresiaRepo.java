package ec.edu.repositorio;

import ec.edu.modelo.Membresia;

public interface IMembresiaRepo {

	void insertar(Membresia membresia);

	Membresia buscar(String codigo);
	
	void actualizar(Membresia membresia);
	
	void eliminar(String codigo);
	
}
