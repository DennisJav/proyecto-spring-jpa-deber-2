package ec.edu.service;

import java.util.List;

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

	@Override
	public List<Egresado> buscarPorNombreJoin(String nombre) {
		// TODO Auto-generated method stub
		return this.egresadoRepo.buscarEgresadoPorNombreJoin(nombre);
	}

	@Override
	public List<Egresado> buscarPorNombreJoinLeft(String nombre) {
		// TODO Auto-generated method stub
		return this.egresadoRepo.buscarEgresadoPorNombreJoinLeft(nombre);
	}

	@Override
	public List<Egresado> buscarPorNombreJoinRight(String nombre) {
		// TODO Auto-generated method stub
		return this.egresadoRepo.buscarEgresadoPorNombreJoinRight(nombre);
	}

	@Override
	public List<Egresado> buscarPorNombreWhere(String nombre) {
		// TODO Auto-generated method stub
		return this.egresadoRepo.buscarEgresadoPorNombreWhere(nombre);
	}
	
	
}
