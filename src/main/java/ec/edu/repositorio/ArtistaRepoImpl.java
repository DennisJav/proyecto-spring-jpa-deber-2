package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Artista;

@Repository
@Transactional
public class ArtistaRepoImpl implements IArtistaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.entityManager.persist(artista);
	}

	@Override
	public void acctualizarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.entityManager.merge(artista);
	}

	@Override
	public void borrarArtista(Integer id) {
		// TODO Auto-generated method stub
		Artista art = this.buscarArtista(id);
		
		this.entityManager.remove(art);
		
	}

	@Override
	public Artista buscarArtista(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Artista.class, id);
	}

	@Override
	public Artista buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select a from Artista a where a.apellido = :valor");
		miQuery.setParameter("valor", apellido);	
		Artista artis = (Artista)miQuery.getSingleResult();
		return artis;
	}

}
