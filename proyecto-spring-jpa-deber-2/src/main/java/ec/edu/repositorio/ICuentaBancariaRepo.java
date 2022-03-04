package ec.edu.repositorio;

import java.util.List;

import ec.edu.modelo.CuentaBancaria;
import ec.edu.modelo.CuentaHabiente;

public interface ICuentaBancariaRepo {

	void insertarCuentaBancaria(CuentaBancaria cuentaBancaria);

	void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria);

	void borrarCuentaBancaria(Integer id);

	CuentaBancaria buscarCuentaBancaria(Integer id);

	List<CuentaBancaria> buscarCuentaBancariaHabiente(CuentaHabiente cuentaHabiente);

	CuentaBancaria buscarCuentaBancariaNumero(String numero);
	
}
