package ec.edu.repositorio;

import ec.edu.modelo.CuentaHabiente;

public interface ICuentaHabienteRepo {

	void insertarCuentaHabiente(CuentaHabiente cuentaHabiente);

	void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente);

	void borrarCuentaHabiente(Integer id);

	CuentaHabiente buscarCuentaHabiente(Integer id);

	CuentaHabiente buscarCuentaHabienteCedula(String cedula);
}
