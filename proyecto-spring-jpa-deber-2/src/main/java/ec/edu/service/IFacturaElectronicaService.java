package ec.edu.service;

import ec.edu.modelo.FacturaElectronica;

public interface IFacturaElectronicaService {

	void insertarFactElectronica(FacturaElectronica facturaElectronica);

	FacturaElectronica buscarPorId(Integer id);

	void actualizarFactElectronica(FacturaElectronica facturaElectronica);

	void eliminarFactElectronica(Integer id);
}
