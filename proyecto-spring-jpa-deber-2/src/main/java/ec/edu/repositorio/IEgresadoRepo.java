package ec.edu.repositorio;

import java.util.List;

import ec.edu.modelo.Egresado;

public interface IEgresadoRepo {
	void igresarEgresado(Egresado egresado);

	List<Egresado> buscarEgresadoPorNombreJoin(String nombre);
	List<Egresado>  buscarEgresadoPorNombreJoinLeft(String nombre);
	List<Egresado> buscarEgresadoPorNombreJoinRight(String nombre);
	List<Egresado> buscarEgresadoPorNombreWhere(String nombre);
	
	
}
