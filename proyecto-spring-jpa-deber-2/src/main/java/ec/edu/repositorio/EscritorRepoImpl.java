package ec.edu.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Escritor;

@Repository
@Transactional
public class EscritorRepoImpl implements IEscritorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresarEscritor(Escritor escritor) {
		// TODO Auto-generated method stub

		this.entityManager.persist(escritor);
	}

	@Override
	public void actualizarEscritor(Escritor escritor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(escritor);
	}

	@Override
	public void borrarEscritor(Integer id) {
		// TODO Auto-generated method stub
		Escritor esc = this.buscarEscritor(id);
		this.entityManager.remove(esc);
	}

	@Override
	public Escritor buscarEscritor(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Escritor.class, id);
	}

	@Override
	public Escritor buscarEscritorPorNovela(String novela) {

		Query miQuery = this.entityManager.createQuery("select e from Escritor e where e.novela = :valor");
		miQuery.setParameter("valor", novela);
		Escritor escr = (Escritor) miQuery.getSingleResult();

		return escr;
	}

	@Override
	public Escritor buscarEscritorPorNovelaType(String novela) {

		TypedQuery<Escritor> miTypedQuery = (TypedQuery<Escritor>) this.entityManager
				.createQuery("select e from Escritor e where e.novela = :valor");
		miTypedQuery.setParameter("valor", novela);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public Escritor buscarEscritorPorNovelaNamed(String novela) {

		Query miQuery = this.entityManager.createNamedQuery("Escritor.buscarPorNovela");
		miQuery.setParameter("valor", novela);
		return (Escritor) miQuery.getSingleResult();
	}

	@Override
	public Escritor buscarEscritorPorNovelaNativeQuery(String novela) {
		Query miQuery = this.entityManager.createNativeQuery("select * from escritor e where e.novela = :valor",Escritor.class);
		miQuery.setParameter("valor", novela);
		return (Escritor) miQuery.getSingleResult();
	}

	@Override
	public List<Escritor> buscarEscritorPorNovelaCriteriaApi(String novela) {
		CriteriaBuilder miCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Escritor> miQuery = miCriteria.createQuery(Escritor.class);
		Root<Escritor> miTabla = miQuery.from(Escritor.class);
		
		Predicate p1 = miCriteria.equal(miTabla.get("novela"), novela);
		
		miQuery.select(miTabla).where(p1);
		
		TypedQuery<Escritor> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getResultList();
	}

}
