package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.modelo.Consumo;
import ec.edu.modelo.TarjetaDeCredito;

public interface ITarjetaDeCreditoService {

	void guardarTarjeta(TarjetaDeCredito tarjeta);
	void actualizarTarjeta(TarjetaDeCredito tarjeta);
	void actualizarTarjeta2(TarjetaDeCredito tarjeta);
	TarjetaDeCredito buscaTarjetaPorNumero(String numero);
	void realizarCompra(String numeroTarjeta, Consumo consumo);
	
}
