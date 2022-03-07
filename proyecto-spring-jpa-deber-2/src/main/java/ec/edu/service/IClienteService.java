package ec.edu.service;

import ec.edu.modelo.Cliente;

public interface IClienteService {
	
	void insertarCliente(Cliente cliente);
	
	Cliente buscarPorCedula(String cedula);
	
	void actualizarCliente(Cliente cliente);
}
