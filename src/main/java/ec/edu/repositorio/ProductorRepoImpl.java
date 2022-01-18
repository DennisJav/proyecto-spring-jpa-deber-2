package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Productor;

@Repository
@Transactional
public class ProductorRepoImpl implements IProductorRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresarProductor(Productor productor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(productor);
	}

	@Override
	public void actualizarProductor(Productor productor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(productor);
	}

}
