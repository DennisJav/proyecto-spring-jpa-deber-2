package ec.edu.repositorio;

import java.util.List;

import ec.edu.modelo.Productor;

public interface IProductorRepo {
	void ingresarProductor(Productor productor);
	void actualizarProductor(Productor productor);
	void borrarProductor(Integer id);
	Productor buscarProductor(Integer id);
	Productor buscarProductorPorProductora(String productora);
	Productor buscarProductorPorProductoraType(String productora);
	Productor buscarProductorPorProductoraNamed(String productora);
	Productor buscarProductorPorProductoraNativeQuery(String productora);
	List<Productor> buscarProductorPorProductoraCriteriaApi(String productora);
}
