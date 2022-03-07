package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.FacturaElectronica;
import ec.edu.repositorio.IFacturaElectronicaRepo;

@Service
public class FacturaElectronicaServiceImpl implements IFacturaElectronicaService{


	@Autowired
	private IFacturaElectronicaRepo facturaElectronicaRepo;

	@Override
	public void insertarFactElectronica(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.facturaElectronicaRepo.insertar(facturaElectronica);
	}

	@Override
	public FacturaElectronica buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaElectronicaRepo.buscar(id);
	}

	@Override
	public void actualizarFactElectronica(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.facturaElectronicaRepo.actualizar(facturaElectronica);
	}

	@Override
	public void eliminarFactElectronica(Integer id) {
		// TODO Auto-generated method stub
		this.facturaElectronicaRepo.eliminar(id);
	}

	

}
