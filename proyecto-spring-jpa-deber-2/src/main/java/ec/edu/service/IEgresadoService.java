package ec.edu.service;

import java.util.List;

import ec.edu.modelo.Egresado;

public interface IEgresadoService {
	void guardarEgresado(Egresado egresado);
	List<Egresado> buscarPorNombreJoin(String nombre);
	List<Egresado> buscarPorNombreJoinLeft(String nombre);
	List<Egresado> buscarPorNombreJoinRight(String nombre);
	List<Egresado> buscarPorNombreWhere(String nombre);
	
}
