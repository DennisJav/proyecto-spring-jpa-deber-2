package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Membresia;

@Repository
@Transactional
public class MembresiaRepoImpl implements IMembresiaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(membresia);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public Membresia buscar(String codigo) {
		TypedQuery<Membresia> myQuery = this.entityManager
				.createQuery("SELECT m FROM Membresia m WHERE m.codigo=:valor", Membresia.class);
		myQuery.setParameter("valor", codigo);
		return myQuery.getSingleResult();
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Membresia membresia) {
		Membresia memb = this.buscar(membresia.getCodigo());
		this.entityManager.merge(memb);

	}

	@Override
	public void eliminar(String codigo) {
		Membresia memb = this.buscar(codigo);
		this.entityManager.remove(memb);

	}

}
