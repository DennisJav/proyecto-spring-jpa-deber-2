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

	@Override
	public void borrarEscritor(Integer id) {
		// TODO Auto-generated method stub
		this.escritorRepo.borrarEscritor(id);
	}

	@Override
	public Escritor buscarEscritor(Integer id) {
		// TODO Auto-generated method stub
		return this.escritorRepo.buscarEscritor(id);
	}

	@Override
	public Escritor buscarEscritorPorNovela(String novela) {
		// TODO Auto-generated method stub
		return this.escritorRepo.buscarEscritorPorNovela(novela);
	}

	@Override
	public Escritor buscarEscritorPorNovelaTyped(String novela) {
		// TODO Auto-generated method stub
		return this.escritorRepo.buscarEscritorPorNovelaType(novela);
	}

	@Override
	public Escritor buscarEscritorPorNovelaNamed(String novela) {
		// TODO Auto-generated method stub
		return this.escritorRepo.buscarEscritorPorNovelaNamed(novela);
	}

}
