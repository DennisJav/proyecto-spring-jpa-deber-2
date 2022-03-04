package ec.edu.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.CuentaHabiente;
import ec.edu.repositorio.ICuentaHabienteRepo;

@Service
public class CuentaHabienteServiceImpl implements ICuentaHabienteService{

	@Autowired
	private ICuentaHabienteRepo cuentaHabienteRepo;
	
	@Override
	public void insertarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.cuentaHabienteRepo.insertarCuentaHabiente(cuentaHabiente);
	}

	@Override
	public void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.cuentaHabienteRepo.actualizarCuentaHabiente(cuentaHabiente);
	}

	@Override
	public void borrarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaHabienteRepo.borrarCuentaHabiente(id);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public CuentaHabiente buscarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaHabienteRepo.buscarCuentaHabiente(id);
	}

	@Override
	public CuentaHabiente buscarCuentaHabienteCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.cuentaHabienteRepo.buscarCuentaHabienteCedula(cedula);
	}

}
