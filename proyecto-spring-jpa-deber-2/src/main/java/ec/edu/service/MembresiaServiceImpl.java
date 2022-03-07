package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Membresia;
import ec.edu.repositorio.IMembresiaRepo;

@Service
public class MembresiaServiceImpl implements IMembresiaService{

	@Autowired
	private IMembresiaRepo membRepo;
	
	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membRepo.insertar(membresia);
	}

	@Override
	public Membresia buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.membRepo.buscar(codigo);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membRepo.actualizar(membresia);
	}

	@Override
	public void eliminarMembresiaPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.membRepo.eliminar(codigo);
	}

}
