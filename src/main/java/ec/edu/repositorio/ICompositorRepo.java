package ec.edu.repositorio;


import ec.edu.modelo.Compositor;

public interface ICompositorRepo {
	void ingresarCompositor(Compositor compositor);
	void actualizarCompositor(Compositor compositor);
	void borrarCompositor(Integer id);
	Compositor buscarCompositor(Integer id);
	Compositor buscarCompositorPorNombre(String nombre);
	Compositor buscarCompositorPorNombreType(String nombre);
	Compositor buscarCompositorPorNombreNamed(String nombre);
}
