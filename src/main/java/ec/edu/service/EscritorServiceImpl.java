package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Escritor;
import ec.edu.repositorio.IEscritorRepo;

@Service
public class EscritorServiceImpl implements IEscritorService{

	@Autowired
	private IEscritorRepo escritorRepo;
	
	@Override
	public void guardarEscritor(Escritor escritor) {
		// TODO Auto-generated method stub
		this.escritorRepo.ingresarEscritor(escritor);
	}

	@Override
	public void modificarEscritor(Escritor escritor) {
		// TODO Auto-generated method stub
		this.escritorRepo.actualizarEscritor(escritor);
	}

}
