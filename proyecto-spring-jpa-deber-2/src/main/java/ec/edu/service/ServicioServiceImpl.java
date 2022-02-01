package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Servicio;
import ec.edu.repositorio.IServicioRepo;

@Service
public class ServicioServiceImpl implements IServicioService{

	@Autowired
	private IServicioRepo servicioRepo;

	@Override
	public void guardarServicio(Servicio servicio) {
		// TODO Auto-generated method stub
		this.servicioRepo.insertarServicio(servicio);
	}
	
	
	
}
