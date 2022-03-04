package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.HistoricoRetiros;
import ec.edu.repositorio.IHistoricoRetirosRepo;

@Service
public class HistoricoRetirosServiceImpl implements IHistoricoRetirosService{

	@Autowired
	private IHistoricoRetirosRepo historicoRetirosRepo;
	
	@Override
	public void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HistoricoRetiros buscarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
