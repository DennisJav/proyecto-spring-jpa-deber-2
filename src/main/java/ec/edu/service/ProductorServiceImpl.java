package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Productor;
import ec.edu.repositorio.IProductorRepo;

@Service
public class ProductorServiceImpl implements IProductorService{

	@Autowired
	private IProductorRepo productorRepo;
	
	@Override
	public void guardarProductor(Productor productor) {
		// TODO Auto-generated method stub
		this.productorRepo.ingresarProductor(productor);
	}

	@Override
	public void modificarProductor(Productor productor) {
		// TODO Auto-generated method stub
		this.productorRepo.actualizarProductor(productor);
	}

	@Override
	public void borrarProductor(Integer id) {
		// TODO Auto-generated method stub
		this.productorRepo.borrarProductor(id);
	}

	@Override
	public Productor buscarProductor(Integer id) {
		// TODO Auto-generated method stub
		return this.productorRepo.buscarProductor(id);
	}

	@Override
	public Productor buscarProductorPorProductora(String productora) {
		// TODO Auto-generated method stub
		return this.productorRepo.buscarProductorPorProductora(productora);
	}

	@Override
	public Productor buscarProductorPorProductoraTyped(String productora) {
		// TODO Auto-generated method stub
		return this.productorRepo.buscarProductorPorProductoraType(productora);
	}

	@Override
	public Productor buscarProductorPorProductoraNamed(String productora) {
		// TODO Auto-generated method stub
		return this.productorRepo.buscarProductorPorProductoraNamed(productora);
	}

	@Override
	public Productor buscarProductorPorProductoraNativeQuery(String productora) {
		// TODO Auto-generated method stub
		return this.productorRepo.buscarProductorPorProductoraNativeQuery(productora);
	}

}
