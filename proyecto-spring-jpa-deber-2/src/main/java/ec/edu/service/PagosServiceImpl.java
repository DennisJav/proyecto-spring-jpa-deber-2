package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Pagos;
import ec.edu.repositorio.IPagosRepo;

@Service
public class PagosServiceImpl implements IPagosService{

	@Autowired
	private IPagosRepo pagosRepo;
	
	@Override
	public void insertarRegistroPago(Pagos pago) {
		// TODO Auto-generated method stub
		this.pagosRepo.insertar(pago);
	}

	@Override
	public Pagos buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pagosRepo.buscar(id);
	}

	@Override
	public void actualizarRegistroPago(Pagos pago) {
		// TODO Auto-generated method stub
		this.pagosRepo.actualizar(pago);
	}

	@Override
	public void eliminarRegistroPago(Integer id) {
		// TODO Auto-generated method stub
		this.pagosRepo.eliminar(id);
	}

}
