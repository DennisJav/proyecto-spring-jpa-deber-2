package ec.edu.service;

import java.math.BigDecimal;
import java.util.List;

import ec.edu.modelo.CuentaBancaria;

public interface ICajeroBancarioService {

	List<CuentaBancaria> consultarCuentas(String cedula);

	void retirarDinero(String numeroCuenta, BigDecimal valorRetirar);

	BigDecimal consultarSaldo(String numeroCuenta);
	
}
