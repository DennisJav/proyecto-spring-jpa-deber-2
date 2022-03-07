package ec.edu.service;

import ec.edu.modelo.HistoricoRetiros;

public interface IHistoricoRetirosService {
	
	
	void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros);

	void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros);

	void borrarHistoricoRetiros(Integer id);

	HistoricoRetiros buscarHistoricoRetiros(Integer id);
}
