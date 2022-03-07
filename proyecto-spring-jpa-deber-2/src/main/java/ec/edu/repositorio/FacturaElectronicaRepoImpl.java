package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.FacturaElectronica;


@Repository
@Transactional
public class FacturaElectronicaRepoImpl implements IFacturaElectronicaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(facturaElectronica);
	}

	@Override
	public FacturaElectronica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(FacturaElectronica.class, id);
	}

	@Override
	public void actualizar(FacturaElectronica facturaElectronica) {
		FacturaElectronica fc = this.buscar(facturaElectronica.getId());
		this.entityManager.merge(fc);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		FacturaElectronica fc = this.buscar(id);
		this.entityManager.remove(fc);
	}
}
