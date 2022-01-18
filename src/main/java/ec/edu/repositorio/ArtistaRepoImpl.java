package ec.edu.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

}
