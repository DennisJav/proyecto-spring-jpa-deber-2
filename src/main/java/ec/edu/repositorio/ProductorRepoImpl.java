package ec.edu.repositorio;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
		Query miQuery = this.entityManager.createQuery("select p from Productor p where p.productora = :valor");
		miQuery.setParameter("valor", productora);
		Productor produc = (Productor) miQuery.getResultList();
		
		return produc;
	}

	@Override
	public Productor buscarProductorPorProductoraType(String productora) {

		TypedQuery<Productor> miTypedQuery = (TypedQuery<Productor>) this.entityManager.createQuery("select p from Productor p where p.productora = :valor");
		miTypedQuery.setParameter("valor", productora);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public Productor buscarProductorPorProductoraNamed(String productora) {
//		Query miQuery = this.entityManager.createNamedQuery("Guardia.buscarPorApellido");
//		miQuery.setParameter("valor", apellido);
//		return (Guardia) miQuery.getSingleResult();
		Query miQuery = this.entityManager.createNamedQuery("Productor.buscarPorProductora");
		miQuery.setParameter("valor", productora);
		return (Productor) miQuery.getSingleResult();
	}

}
