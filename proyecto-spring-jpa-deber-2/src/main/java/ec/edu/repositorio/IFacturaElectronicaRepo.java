package ec.edu.repositorio;

import ec.edu.modelo.FacturaElectronica;

public interface IFacturaElectronicaRepo {

	void insertar(FacturaElectronica facturaElectronica);

	FacturaElectronica buscar(Integer id);

	void actualizar(FacturaElectronica facturaElectronica);

	void eliminar(Integer id);
}
