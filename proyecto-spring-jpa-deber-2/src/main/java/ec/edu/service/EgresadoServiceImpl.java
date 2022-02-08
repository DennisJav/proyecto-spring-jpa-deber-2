package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Egresado;
import ec.edu.repositorio.IEgresadoRepo;

@Service
public class EgresadoServiceImpl implements IEgresadoService{

	@Autowired
	private IEgresadoRepo egresadoRepo;

	@Override
	public void guardarEgresado(Egresado egresado) {
		this.egresadoRepo.igresarEgresado(egresado);
		
	}
	
	
}
