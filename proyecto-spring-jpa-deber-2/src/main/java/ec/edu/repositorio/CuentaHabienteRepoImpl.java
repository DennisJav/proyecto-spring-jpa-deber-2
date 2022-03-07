package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.CuentaHabiente;

@Transactional
@Repository
public class CuentaHabienteRepoImpl implements ICuentaHabienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaHabiente);
		
	}

	@Override
	public void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaHabiente);
	}

	@Override
	public void borrarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		CuentaHabiente borrar = this.buscarCuentaHabiente(id);
		this.entityManager.remove(borrar);
	}

	@Override
	public CuentaHabiente buscarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaHabiente.class, id);
	}

	@Override
	public CuentaHabiente buscarCuentaHabienteCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaHabiente> myQuery = this.entityManager
				.createQuery("SELECT c FROM CuentaHabiente c WHERE c.cedula=:valor", CuentaHabiente.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

	
	
	
}
