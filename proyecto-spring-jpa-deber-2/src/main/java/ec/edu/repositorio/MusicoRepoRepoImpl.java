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

import ec.edu.modelo.Musico;

@Repository
@Transactional
public class MusicoRepoRepoImpl implements IMusicoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresarMusico(Musico musico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(musico);
	}

	@Override
	public void actualizarMusico(Musico musico) {
		// TODO Auto-generated method stub
		this.entityManager.merge(musico);
	}

	@Override
	public void borrarMusico(Integer id) {
		// TODO Auto-generated method stub
		Musico musi = this.buscarMusico(id);
		this.entityManager.remove(musi);
	}

	@Override
	public Musico buscarMusico(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Musico.class, id);
	}

	@Override
	public Musico buscarMusicoPorMusica(String musica) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select m from Musico m where m.musica = :valor");
		miQuery.setParameter("valor", musica);
		Musico musi = (Musico) miQuery.getSingleResult();
		return musi;
	}

	@Override
	public Musico buscarMusicoPorMusicaType(String musica) {

		TypedQuery<Musico> mitTypedQuery = (TypedQuery<Musico>) this.entityManager
				.createQuery("select m from Musico m where m.musica = :valor");
		mitTypedQuery.setParameter("valor", musica);
		return mitTypedQuery.getSingleResult();
	}

	@Override
	public Musico buscarMusicoPorMusicaNamed(String musica) {

		Query miQuery = this.entityManager.createNamedQuery("Musico.buscarPorMusica");
		miQuery.setParameter("valor", musica);
		return (Musico) miQuery.getSingleResult();
	}

	@Override
	public Musico buscarMusicoPorMusicaNativeQuery(String musica) {
		Query miQuery = this.entityManager.createNativeQuery("select * from musico m where m.musica = :valor",
				Musico.class);
		miQuery.setParameter("valor", musica);
		return (Musico) miQuery.getSingleResult();
	}

	@Override
	public List<Musico> buscarMusicoPorMusicaCriteriaApi(String musica) {
		// TODO Auto-generated method stub
		CriteriaBuilder miCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Musico> miQuery = miCriteria.createQuery(Musico.class);
		Root<Musico> miTabla = miQuery.from(Musico.class);

		Predicate p1 = miCriteria.equal(miTabla.get("musica"), musica);

		miQuery.select(miTabla).where(p1);

		TypedQuery<Musico> typedQuery = this.entityManager.createQuery(miQuery);

		return typedQuery.getResultList();

	}

}
