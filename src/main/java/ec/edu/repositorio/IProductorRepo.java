package ec.edu.repositorio;

import ec.edu.modelo.Productor;

public interface IProductorRepo {
	void ingresarProductor(Productor productor);
	void actualizarProductor(Productor productor);
	void borrarProductor(Integer id);
	Productor buscarProductor(Integer id);
	Productor buscarProductorPorProductora(String productora);
}
