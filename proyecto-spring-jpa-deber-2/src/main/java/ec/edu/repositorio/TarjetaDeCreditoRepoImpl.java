package ec.edu.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.TarjetaDeCredito;

@Repository
@Transactional
public class TarjetaDeCreditoRepoImpl implements ITarjetaDeCreditoRepo {

	public static final Logger LOG = LoggerFactory.getLogger(TarjetaDeCreditoRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearTarjetaCredito(TarjetaDeCredito tarjeta) {

		this.entityManager.persist(tarjeta);

	}

	@Override
	public void actualizarTarjera(TarjetaDeCredito tarjeta) {

		this.entityManager.merge(tarjeta);

	}


	@Override
	public TarjetaDeCredito buscarTarjetaPorNumero(String numero) {
		
		
		TypedQuery<TarjetaDeCredito> miTypedQuery = this.entityManager
				.createQuery("select t from TarjetaDeCredito t where t.numeroTarjeta =:valor", TarjetaDeCredito.class);

		miTypedQuery.setParameter("valor", numero);
		
		return miTypedQuery.getSingleResult();
	}



}
