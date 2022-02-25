package ec.edu.repositorio;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Egresado;


@Repository
@Transactional
public class EgresadoRepoImpl implements IEgresadoRepo {
	public static final Logger LOG = LoggerFactory.getLogger(EgresadoRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void igresarEgresado(Egresado egresado) {
		this.entityManager.persist(egresado);
	}

	@Override
	public List<Egresado> buscarEgresadoPorNombreJoin(String nombre) {

		TypedQuery<Egresado> miQuery = this.entityManager
				.createQuery("SELECT e from Egresado e JOIN e.tesis t WHERE e.nombre <=: nombre", Egresado.class);
		miQuery.setParameter("nombre", nombre);
		
		List<Egresado> listaEgresado = miQuery.getResultList();
		LOG.info("Longitud: "+listaEgresado.size());
		listaEgresado.stream().forEach(l -> {
			LOG.info(l.toString());
		}  );
		
		return listaEgresado;
	}

	@Override
	public List<Egresado> buscarEgresadoPorNombreJoinLeft(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Egresado> miQuery = this.entityManager
				.createQuery("SELECT e from Egresado e LEFT JOIN e.tesis t WHERE e.nombre <=: nombre", Egresado.class);
		miQuery.setParameter("nombre", nombre);
		List<Egresado> listaEgresado = miQuery.getResultList();
		LOG.info("Longitud: "+listaEgresado.size());
		listaEgresado.stream().forEach(l -> {
			LOG.info(l.toString());
		}  );
		
		return listaEgresado;
	}

	@Override
	public List<Egresado> buscarEgresadoPorNombreJoinRight(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Egresado> miQuery = this.entityManager
				.createQuery("SELECT e from Egresado e RIGHT JOIN e.tesis t WHERE e.nombre <=: nombre", Egresado.class);
		miQuery.setParameter("nombre", nombre);
		List<Egresado> listaEgresado = miQuery.getResultList();
		LOG.info("Longitud: "+listaEgresado.size());
		listaEgresado.stream().forEach(l -> {
			LOG.info(l.toString());
		}  );
		
		return listaEgresado;

	}

	@Override
	public List<Egresado> buscarEgresadoPorNombreWhere(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Egresado> miQuery = this.entityManager
				.createQuery("SELECT e from Egresado e, Tesis t WHERE t =e.tesis AND e.nombre <=: nombre ", Egresado.class);
		miQuery.setParameter("nombre", nombre);
		
		List<Egresado> listaEgresado = miQuery.getResultList();
		LOG.info("Longitud: "+listaEgresado.size());
		listaEgresado.stream().forEach(l -> {
			LOG.info(l.toString());
		}  );
		
		return listaEgresado;
	}

}
