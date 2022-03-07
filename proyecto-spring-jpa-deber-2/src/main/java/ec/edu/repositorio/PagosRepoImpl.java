package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Pagos;

@Repository
@Transactional
public class PagosRepoImpl implements IPagosRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Pagos pagos) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pagos);
	}

	@Override
	public Pagos buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pagos.class, id);
	}

	@Override
	public void actualizar(Pagos pagos) {
		// TODO Auto-generated method stub
		Pagos pago = this.buscar(pagos.getId());
		this.entityManager.merge(pago);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pagos pagoEliminar = this.buscar(id);
		this.entityManager.remove(pagoEliminar);
	
	}

}
