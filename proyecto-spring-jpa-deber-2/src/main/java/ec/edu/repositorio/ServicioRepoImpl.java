package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Servicio;

@Repository
@Transactional
public class ServicioRepoImpl implements IServicioRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarServicio(Servicio servicio) {
		this.entityManager.persist(servicio);
		
	}

}
