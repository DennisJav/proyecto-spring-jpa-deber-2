package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import ec.edu.modelo.CuentaBancaria;
import ec.edu.modelo.CuentaHabiente;
import ec.edu.modelo.HistoricoRetiros;

@Service
public class CajeroBancarioServiceImpl implements ICajeroBancarioService{

	private static final Logger LOG = LoggerFactory.getLogger(CajeroBancarioServiceImpl.class);
	
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	@Autowired
	private ICuentaHabienteService cuentaHabienteService;
	@Autowired
	private IHistoricoRetirosService historicoRetirosService;
	
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<CuentaBancaria> consultarCuentas(String cedula) {
		// TODO Auto-generated method stub
		
		CuentaHabiente cuentaBuscar = this.cuentaHabienteService.buscarCuentaHabienteCedula(cedula);
		
		return this.cuentaBancariaService.buscarCuentaBancariaHabiente(cuentaBuscar);
	}

	
	@Override
	@Transactional
	public void retirarDinero(String numeroCuenta, BigDecimal valorRetirar) {
		// TODO Auto-generated method stub
		try {
			
			CuentaBancaria cuentaBancaria = this.cuentaBancariaService.buscarCuentaBancariaNumero(numeroCuenta);
			CuentaHabiente cuentaHabiente = this.cuentaHabienteService.buscarCuentaHabiente(cuentaBancaria.getCuentaHabiente().getId());
			
			cuentaBancaria.setSaldo(cuentaBancaria.getSaldo().subtract(valorRetirar));
			this.cuentaBancariaService.actualizarCuentaBancaria(cuentaBancaria);
			
			HistoricoRetiros historico = new HistoricoRetiros();
			historico.setCuentaBancaria(cuentaBancaria);
			historico.setCuentaHabiente(cuentaHabiente);
			historico.setFechaRetiro(LocalDateTime.now());
			historico.setMontoRetiro(valorRetirar);
			this.historicoRetirosService.insertarHistoricoRetiros(historico);
			
			LOG.info("Retiro exitoso,<< valor: "+valorRetirar+" CUenta: "+numeroCuenta+">>");
			
			
			
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			LOG.info("Datos Erroneos NO SE EFECTUO EL RETIRO");
		}
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public BigDecimal consultarSaldo(String numeroCuenta) {
		// TODO Auto-generated method stub
		
		try {
			return this.cuentaBancariaService.buscarCuentaBancariaNumero(numeroCuenta).getSaldo();
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			LOG.info("DATOS ERRONEOS");
			return null;
		}
		
		
	}

}
