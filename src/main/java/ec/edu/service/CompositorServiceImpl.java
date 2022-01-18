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

}
