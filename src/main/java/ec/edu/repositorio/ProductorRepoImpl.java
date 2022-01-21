package ec.edu.repositorio;

import javax.persistence.Query;
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

	@Override
	public void borrarProductor(Integer id) {
		// TODO Auto-generated method stub
		Productor prod=this.buscarProductor(id);
		this.entityManager.remove(prod);
	}

	@Override
	public Productor buscarProductor(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Productor.class, id);
	}

	@Override
	public Productor buscarProductorPorProductora(String productora) {
		Query miQuery = this.entityManager.createQuery("select p from Productora p where p.productora = :valor");
		miQuery.setParameter("valor", productora);
		Productor produc = (Productor) miQuery.getSingleResult();
		
		return produc;
	}

}
