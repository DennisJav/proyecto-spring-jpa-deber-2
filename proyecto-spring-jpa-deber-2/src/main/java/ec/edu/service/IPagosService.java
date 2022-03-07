package ec.edu.service;

import ec.edu.modelo.Pagos;

public interface IPagosService {

	void insertarRegistroPago(Pagos pago);
	
	Pagos buscarPorId(Integer id);
	
	void actualizarRegistroPago(Pagos pago);
	
	void eliminarRegistroPago(Integer id);
	
}
