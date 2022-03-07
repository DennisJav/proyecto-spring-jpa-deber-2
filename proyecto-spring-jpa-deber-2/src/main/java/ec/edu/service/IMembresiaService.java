package ec.edu.service;

import ec.edu.modelo.Membresia;

public interface IMembresiaService {

	void insertarMembresia(Membresia membresia);

	Membresia buscarPorCodigo(String codigo);
	
	void actualizarMembresia(Membresia membresia);
	
	void eliminarMembresiaPorCodigo(String codigo);
}
