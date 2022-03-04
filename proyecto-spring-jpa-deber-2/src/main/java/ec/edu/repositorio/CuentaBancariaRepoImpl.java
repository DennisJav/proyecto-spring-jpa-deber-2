package ec.edu.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.CuentaBancaria;
import ec.edu.modelo.CuentaHabiente;

@Transactional
@Repository
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public void borrarCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		CuentaBancaria borrar = this.buscarCuentaBancaria(id);
		this.entityManager.remove(borrar);
	}

	@Override
	public CuentaBancaria buscarCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public List<CuentaBancaria> buscarCuentaBancariaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub

		TypedQuery<CuentaBancaria> miQuery = this.entityManager
				.createQuery("SELECT c FROM CuentaBancaria c WHERE c.cuentaHabiente =: valor", CuentaBancaria.class);

		miQuery.setParameter("valor", cuentaHabiente);
		
		return miQuery.getResultList();
	}

	@Override
	public CuentaBancaria buscarCuentaBancariaNumero(String numero) {
		// TODO Auto-generated method stub

		TypedQuery<CuentaBancaria> miQuery = this.entityManager
				.createQuery("SELECT c FROM CuentaBancaria c WHERE c.numeroCuenta =: valor", CuentaBancaria.class);

		miQuery.setParameter("valor", numero);
		
		return miQuery.getSingleResult();
	}

}
