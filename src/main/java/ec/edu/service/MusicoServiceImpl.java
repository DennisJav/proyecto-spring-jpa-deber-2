package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Musico;
import ec.edu.repositorio.IMusicoRepo;

@Service
public class MusicoServiceImpl implements IMusicoService{

	@Autowired
	private IMusicoRepo musicoRepo;
	
	@Override
	public void guardarMusico(Musico musico) {
		// TODO Auto-generated method stub
		this.musicoRepo.ingresarMusico(musico);
		
	}

	@Override
	public void modificarMusico(Musico musico) {
		// TODO Auto-generated method stub
		this.musicoRepo.actualizarMusico(musico);
	}

}
