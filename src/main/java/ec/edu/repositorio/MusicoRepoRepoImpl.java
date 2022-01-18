package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Musico;

@Repository
@Transactional
public class MusicoRepoRepoImpl implements IMusicoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresarMusico(Musico musico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(musico);
	}

	@Override
	public void actualizarMusico(Musico musico) {
		// TODO Auto-generated method stub
		this.entityManager.merge(musico);
	}

}
