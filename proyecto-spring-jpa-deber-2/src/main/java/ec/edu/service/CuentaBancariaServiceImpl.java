package ec.edu.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.CuentaBancaria;
import ec.edu.modelo.CuentaHabiente;
import ec.edu.repositorio.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo cuentaBancariaRepo;
	
	
	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.insertarCuentaBancaria(cuentaBancaria);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaBancaria);
	}

	@Override
	public void borrarCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.borrarCuentaBancaria(id);
	}

	@Override
	public CuentaBancaria buscarCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.buscarCuentaBancaria(id);
	}

	@Override
	public List<CuentaBancaria> buscarCuentaBancariaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.buscarCuentaBancariaHabiente(cuentaHabiente);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public CuentaBancaria buscarCuentaBancariaNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.buscarCuentaBancariaNumero(numero);
	}

}
