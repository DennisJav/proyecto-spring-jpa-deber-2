package ec.edu.service;

import ec.edu.modelo.Compositor;

public interface ICompositorService {
	void guardadCompositor(Compositor compositor);
	void modificarCompositor(Compositor compositor);
	void borrarCompositor(Integer id);
	Compositor buscarCompositor(Integer id);
	Compositor buscarCompositorPorNombre(String nombre);
	Compositor buscarCompositorPorNombreTyped(String nombre);
	Compositor buscarCompositorPorNombreNamed(String nombre);
}
