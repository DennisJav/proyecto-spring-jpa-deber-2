package ec.edu.service;

import ec.edu.modelo.CuentaHabiente;

public interface ICuentaHabienteService {

	void insertarCuentaHabiente(CuentaHabiente cuentaHabiente);

	void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente);

	void borrarCuentaHabiente(Integer id);

	CuentaHabiente buscarCuentaHabiente(Integer id);

	CuentaHabiente buscarCuentaHabienteCedula(String cedula);
	
}
