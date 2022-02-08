package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Egresado;

@Repository
@Transactional
public class EgresadoRepoImpl implements IEgresadoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void igresarEgresado(Egresado egresado) {
		this.entityManager.persist(egresado);
	}
	
	
}
