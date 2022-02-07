package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Oficina;

@Repository
@Transactional
public class OficinaRepoImpl implements IOficinaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarOficina(Oficina oficina) {
		this.entityManager.persist(oficina);
	}
	
	
}
