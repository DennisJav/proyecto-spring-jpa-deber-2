package ec.edu.service;

import ec.edu.modelo.Productor;

public interface IProductorService {
	void guardarProductor(Productor productor);
	void modificarProductor(Productor productor);
	void borrarProductor(Integer id);
	Productor buscarProductor(Integer id);
	Productor buscarProductorPorProductora(String productora);
	Productor buscarProductorPorProductoraTyped(String productora);
	Productor buscarProductorPorProductoraNamed(String productora);
	Productor buscarProductorPorProductoraNativeQuery(String productora);
}
