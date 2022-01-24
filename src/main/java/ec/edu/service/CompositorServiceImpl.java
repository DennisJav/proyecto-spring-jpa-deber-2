package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Compositor;
import ec.edu.repositorio.ICompositorRepo;

@Service
public class CompositorServiceImpl implements ICompositorService{

	@Autowired
	private ICompositorRepo compositorRepo;
	
	@Override
	public void guardadCompositor(Compositor compositor) {
		// TODO Auto-generated method stub
		this.compositorRepo.ingresarCompositor(compositor);
	}

	@Override
	public void modificarCompositor(Compositor compositor) {
		// TODO Auto-generated method stub
		this.compositorRepo.actualizarCompositor(compositor);
		
	}

	@Override
	public void borrarCompositor(Integer id) {
		// TODO Auto-generated method stub
		this.compositorRepo.borrarCompositor(id);
	}

	@Override
	public Compositor buscarCompositor(Integer id) {
		// TODO Auto-generated method stub
		return this.compositorRepo.buscarCompositor(id);
	}

	@Override
	public Compositor buscarCompositorPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.compositorRepo.buscarCompositorPorNombre(nombre);
	}

	@Override
	public Compositor buscarCompositorPorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.compositorRepo.buscarCompositorPorNombreType(nombre);
	}

	@Override
	public Compositor buscarCompositorPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.compositorRepo.buscarCompositorPorNombreNamed(nombre);
	}

}
