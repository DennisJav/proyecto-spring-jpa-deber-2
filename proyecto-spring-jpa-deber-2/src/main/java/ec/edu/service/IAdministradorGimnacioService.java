package ec.edu.service;

import ec.edu.modelo.Cliente;

public interface IAdministradorGimnacioService {

	void guardarCliente(Cliente cliente);
	
	void pagarMembresia(String cedula, String codMembresia);
}
