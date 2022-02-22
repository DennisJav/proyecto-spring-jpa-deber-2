package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Consumo;
import ec.edu.modelo.TarjetaDeCredito;
import ec.edu.repositorio.ITarjetaDeCreditoRepo;

@Service
public class TarjetaDeCreditoServiceImpl implements ITarjetaDeCreditoService{

	@Autowired 
	private ITarjetaDeCreditoRepo tarjetaRepo;
	
	@Override
	public void guardarTarjeta(TarjetaDeCredito tarjeta) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.crearTarjetaCredito(tarjeta);
	}

	@Override
	public void actualizarTarjeta(TarjetaDeCredito tarjeta) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.actualizarTarjera(tarjeta);
	}

	@Override
	public TarjetaDeCredito buscaTarjetaPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.tarjetaRepo.buscarTarjetaPorNumero(numero);
	}

	@Override
	@Transactional
	public void realizarCompra( String numeroTarjeta, Consumo consumo) {
		// TODO Auto-generated method stub
		
		TarjetaDeCredito tarjetaOrigen = this.buscaTarjetaPorNumero(numeroTarjeta);
		
		List<Consumo> c1 = new ArrayList<>();
		LocalDateTime fechaCompra = consumo.getFechaConsumo();
		consumo.setTarjeta_de_credito(tarjetaOrigen);
		consumo.setFechaConsumo(fechaCompra);
		BigDecimal valorConsumo = consumo.getValorConsumo();
		consumo.setValorConsumo(valorConsumo);
		c1.add(consumo);
		tarjetaOrigen.setConsumostarjeta(c1);
		
		BigDecimal nuevoValor = tarjetaOrigen.getCupo().subtract(valorConsumo);
		tarjetaOrigen.setCupo(nuevoValor);
		
		this.actualizarTarjeta(tarjetaOrigen);
	
	}
	
	
	
	

}
