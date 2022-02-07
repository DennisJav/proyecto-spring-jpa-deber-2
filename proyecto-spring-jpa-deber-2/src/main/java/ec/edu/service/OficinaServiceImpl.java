package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Oficina;
import ec.edu.repositorio.IOficinaRepo;

@Service
public class OficinaServiceImpl implements IOficinaService{

	@Autowired
	private IOficinaRepo oficinaRepo;

	@Override
	public void guardarOficina(Oficina oficina) {
	
		this.oficinaRepo.insertarOficina(oficina);
	}
	
}
