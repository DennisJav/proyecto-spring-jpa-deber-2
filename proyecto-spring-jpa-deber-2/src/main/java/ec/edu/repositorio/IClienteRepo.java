package ec.edu.repositorio;

import ec.edu.modelo.Cliente;

public interface IClienteRepo {

	void insertar(Cliente cliente);
	
	Cliente buscar(String cedula);
	
	void actualizar(Cliente cliente);
	
	void eliminar (String cedula);
	
}
