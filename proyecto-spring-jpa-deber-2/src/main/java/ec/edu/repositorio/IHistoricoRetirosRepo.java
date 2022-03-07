package ec.edu.repositorio;


import ec.edu.modelo.HistoricoRetiros;

public interface IHistoricoRetirosRepo {

	void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros);

	void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros);

	void borrarHistoricoRetiros(Integer id);

	HistoricoRetiros buscarHistoricoRetiros(Integer id);	
	
}
