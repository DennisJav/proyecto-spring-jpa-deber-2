package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.ProyectoSpringJpaDtDeber21Application;
import ec.edu.modelo.Consumo;
import ec.edu.modelo.TarjetaDeCredito;
import ec.edu.repositorio.ITarjetaDeCreditoRepo;

@Service
public class TarjetaDeCreditoServiceImpl implements ITarjetaDeCreditoService {

	public static final Logger LOG = LoggerFactory.getLogger(TarjetaDeCreditoServiceImpl.class);

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
	public void actualizarTarjeta2(TarjetaDeCredito tarjeta) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.actualizarTarjera2(tarjeta);
	}

	@Override
	public TarjetaDeCredito buscaTarjetaPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.tarjetaRepo.buscarTarjetaPorNumero(numero);
	}

	@Override
	@Transactional
	public void realizarCompra(String numeroTarjeta, Consumo consumo) {
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

		LOG.info("AA1");
		try {
			LOG.info("AA2");
			this.actualizarTarjeta2(tarjetaOrigen);
		} catch (IllegalArgumentException e) {
			LOG.error("ERRROR");
		}

		LOG.info("DA2");

	}

}
