package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Compositor;


@Repository
@Transactional
public class CompositorRepoImpl implements ICompositorRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresarCompositor(Compositor compositor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compositor);
	}

	@Override
	public void actualizarCompositor(Compositor compositor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compositor);
	}

	
}
