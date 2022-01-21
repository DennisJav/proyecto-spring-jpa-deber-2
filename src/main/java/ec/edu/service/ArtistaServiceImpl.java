package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Artista;
import ec.edu.repositorio.IArtistaRepo;

@Service
public class ArtistaServiceImpl implements IArtistaService{

	@Autowired
	private IArtistaRepo artistaRepo;
	
	@Override
	public void guardarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.artistaRepo.insertarArtista(artista);;
	}

	@Override
	public void modificarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.artistaRepo.acctualizarArtista(artista);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.artistaRepo.borrarArtista(id);
	}

	@Override
	public Artista buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarArtista(id);
	}

	@Override
	public Artista buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarPorApellido(apellido);
	}

}
