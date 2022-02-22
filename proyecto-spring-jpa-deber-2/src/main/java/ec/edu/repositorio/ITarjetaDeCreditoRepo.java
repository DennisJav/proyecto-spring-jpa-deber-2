package ec.edu.repositorio;

import java.util.List;

import ec.edu.modelo.TarjetaDeCredito;

public interface ITarjetaDeCreditoRepo {

	void crearTarjetaCredito(TarjetaDeCredito tarjeta);
	void actualizarTarjera(TarjetaDeCredito tarjeta);
	TarjetaDeCredito buscarTarjetaPorNumero(String numero);
}
