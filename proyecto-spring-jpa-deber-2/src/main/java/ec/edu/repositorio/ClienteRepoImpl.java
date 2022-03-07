package ec.edu.repositorio;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Cliente;


@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	@Transactional(value=TxType.MANDATORY)
	public Cliente buscar(String cedula) {
		TypedQuery<Cliente> myQuery = this.entityManager.createQuery("Select c FROM Cliente c WHERE c.cedula=:valor", Cliente.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	@Transactional(value=TxType.MANDATORY)
	public void actualizar(Cliente cliente) {
		Cliente c = this.buscar(cliente.getCedula());
		this.entityManager.merge(c);
	}

	@Override
	public void eliminar(String cedula) {
	Cliente c = this.buscar(cedula);
	this.entityManager.remove(c);
		
	}

}
