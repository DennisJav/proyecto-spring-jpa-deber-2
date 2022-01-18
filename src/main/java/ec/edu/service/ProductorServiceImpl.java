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

}
