package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.HistoricoRetiros;

@Transactional
@Repository
public class HistoricosRetirosRepoImpl implements IHistoricoRetirosRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		this.entityManager.persist(historicoRetiros);
	}

	@Override
	public void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		this.entityManager.merge(historicoRetiros);
	}

	@Override
	public void borrarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		HistoricoRetiros borrar = this.buscarHistoricoRetiros(id);
		this.entityManager.remove(borrar);
		
	}

	@Override
	public HistoricoRetiros buscarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(HistoricoRetiros.class, id);
	}

	
	
	
}
