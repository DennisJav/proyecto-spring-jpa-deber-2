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

	@Override
	public void borrarMusico(Integer id) {
		// TODO Auto-generated method stub
		this.musicoRepo.borrarMusico(id);
	}

	@Override
	public Musico buscarMusico(Integer id) {
		// TODO Auto-generated method stub
		return this.musicoRepo.buscarMusico(id);
	}

	@Override
	public Musico buscarMusicoPorMusica(String musica) {
		// TODO Auto-generated method stub
		return this.musicoRepo.buscarMusicoPorMusica(musica);
	}

	@Override
	public Musico buscarMusicoPorMusicaTyped(String musica) {
		// TODO Auto-generated method stub
		return this.musicoRepo.buscarMusicoPorMusicaType(musica);
	}

	@Override
	public Musico buscarMusicoPorMusicaNamed(String musica) {
		// TODO Auto-generated method stub
		return this.musicoRepo.buscarMusicoPorMusicaNamed(musica);
	}

	@Override
	public Musico buscarMusicoPorMusicaNativeQuery(String musica) {
		// TODO Auto-generated method stub
		return this.musicoRepo.buscarMusicoPorMusicaNativeQuery(musica);
	}

}
