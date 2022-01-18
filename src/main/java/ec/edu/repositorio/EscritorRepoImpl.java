package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Escritor;

@Repository
@Transactional
public class EscritorRepoImpl implements IEscritorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresarEscritor(Escritor escritor) {
		// TODO Auto-generated method stub

		this.entityManager.persist(escritor);
	}

	@Override
	public void actualizarEscritor(Escritor escritor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(escritor);
	}

}
