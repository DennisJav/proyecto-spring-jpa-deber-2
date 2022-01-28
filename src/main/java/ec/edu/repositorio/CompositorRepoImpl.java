package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Compositor;

@Repository
@Transactional
public class CompositorRepoImpl implements ICompositorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresarCompositor(Compositor compositor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compositor);
	}

	@Override
	public void actualizarCompositor(Compositor compositor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compositor);
	}

	@Override
	public void borrarCompositor(Integer id) {
		// TODO Auto-generated method stub
		Compositor comp = this.buscarCompositor(id);
		this.entityManager.remove(comp);
	}

	@Override
	public Compositor buscarCompositor(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Compositor.class, id);
	}

	@Override
	public Compositor buscarCompositorPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select c from Compositor c where c.nombre = :valor");
		miQuery.setParameter("valor", nombre);
		Compositor compo = (Compositor) miQuery.getSingleResult();

		return compo;
	}

	@Override
	public Compositor buscarCompositorPorNombreType(String nombre) {
		// TODO Auto-generated method stub

		TypedQuery<Compositor> miTypedQuery = (TypedQuery<Compositor>) this.entityManager
				.createQuery("select c from Compositor c where c.nombre = :valor");
		miTypedQuery.setParameter("valor", nombre);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public Compositor buscarCompositorPorNombreNamed(String nombre) {

		Query miQuery = this.entityManager.createNamedQuery("Compositor.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		
		return (Compositor) miQuery.getSingleResult();
	}

	@Override
	public Compositor buscarCompositorPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from compositor c where c.nombre = :valor",Compositor.class);
		miQuery.setParameter("valor", nombre);
		
		return (Compositor) miQuery.getSingleResult();
	}

}
