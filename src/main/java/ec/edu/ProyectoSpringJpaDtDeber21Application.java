package ec.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Artista;
import ec.edu.modelo.Compositor;
import ec.edu.modelo.Escritor;
import ec.edu.modelo.Musico;
import ec.edu.modelo.Productor;
import ec.edu.service.IArtistaService;
import ec.edu.service.ICompositorService;
import ec.edu.service.IEscritorService;
import ec.edu.service.IMusicoService;
import ec.edu.service.IProductorService;



@SpringBootApplication
public class ProyectoSpringJpaDtDeber21Application implements CommandLineRunner{

	@Autowired
	private IArtistaService artistaService;
	
	@Autowired
	private ICompositorService compositorService;
	
	@Autowired
	private IEscritorService escritorservice;
	
	@Autowired
	private IMusicoService musicoService;
	
	@Autowired
	private IProductorService productorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaDtDeber21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		//metodos de insercion
//		Artista a1 = new Artista();
//		a1.setNombre("Dennis");
//		a1.setApellido("Tapia1");
//		this.artistaService.guardarArtista(a1);
//		
//		Compositor c1 = new Compositor();
//		c1.setNombre("Denis1");
//		c1.setGenero_musical("Rock1");
//		this.compositorService.guardadCompositor(c1);
////		
//		Escritor e1 = new Escritor();
//		e1.setNombre("Denis");
//		e1.setNovela("La guerra de los cielos1");
//		this.escritorservice.guardarEscritor(e1);
////		
//		Musico m1 = new Musico();
//		m1.setMusica("Rock1");
//		m1.setNombre("Dennis");
//		this.musicoService.guardarMusico(m1);
////		
//		Productor p1 = new Productor();
//		p1.setNombre("Dennis");
//		p1.setProductora("Epicentro1");
//		this.productorService.guardarProductor(p1);
		
		
		//metodos actualizar
		
//		Artista a2 = new Artista();
//		a2.setId(5);
//		a2.setNombre("Javier");
//		a2.setApellido("Tapia");
//		this.artistaService.modificarArtista(a2);
		
//		Compositor c2 = new Compositor();
//		c2.setId(6);
//		c2.setNombre("Javier");
//		c2.setGenero_musical("Rock");
//		this.compositorService.modificarCompositor(c2);
//		
//		Escritor e2 = new Escritor();
//		c2.setId(9);
//		e2.setNombre("Javier");
//		e2.setNovela("La guerra de los cielos");
//		this.escritorservice.modificarEscritor(e2);
//		
//		Musico m2 = new Musico();
//		m2.setId(10);
//		m2.setMusica("Rock");
//		m2.setNombre("Javier");
//		this.musicoService.modificarMusico(m2);
//		
//		Productor p2 = new Productor();
//		p2.setId(11);
//		p2.setNombre("Javier");
//		p2.setProductora("Epicentro");
//		this.productorService.modificarProductor(p2);
//		
		
		//metodos de borrar
		
//		this.artistaService.borrar(36);
//		
//		this.compositorService.borrarCompositor(35);
//		
//		this.escritorservice.borrarEscritor(37);
//		
//		this.musicoService.borrarMusico(37);
//		
//		this.productorService.borrarProductor(36);
		
		//metodos buscar
		
//		Artista art = this.artistaService.buscar(7);
//		System.out.println(art);
//	
//		Compositor comp = this.compositorService.buscarCompositor(8);
//		System.out.println(comp);
//		
//		Escritor es=this.escritorservice.buscarEscritor(9);
//		System.out.println(es);
//		
//		Musico mu = this.musicoService.buscarMusico(10);
//		System.out.println(mu);
//		
//		Productor pr= this.productorService.buscarProductor(11);
//		System.out.println(pr);
		
		//metodos de busqueda por atributo JPQL
		
//		Artista art = this.artistaService.buscarPorApellido("Tapia1");
//		System.out.println(art);
////	
//		Compositor comp = this.compositorService.buscarCompositorPorNombre("Denis1");
//		System.out.println(comp);
////		
//		Escritor es=this.escritorservice.buscarEscritorPorNovela("La guerra de los cielos1");
//		System.out.println(es);
////		
//		Musico mu = this.musicoService.buscarMusicoPorMusica("Rock1");
//		System.out.println(mu);
////		
//		Productor pr= this.productorService.buscarProductorPorProductora("Epicentro1");
//		System.out.println(pr);
//		
//		CONSULTAS TYPED
		
//		Artista art = this.artistaService.buscarPorApellidoTyped("Tapia1");
//		System.out.println(art);
////	
//		Compositor comp = this.compositorService.buscarCompositorPorNombreTyped("Denis1");
//		System.out.println(comp);
////		
//		Escritor es=this.escritorservice.buscarEscritorPorNovelaTyped("La guerra de los cielos1");
//		System.out.println(es);
////		
//		Musico mu = this.musicoService.buscarMusicoPorMusicaTyped("Rock1");
//		System.out.println(mu);
//		
//		Productor pr= this.productorService.buscarProductorPorProductoraTyped("Epicentro1");
//		System.out.println(pr);
		
//		CONSULTAS NAMED
		
//		Artista art = this.artistaService.buscarPorApellidoNamed("Tapia1");
//		System.out.println(art);
////	
//		Compositor comp = this.compositorService.buscarCompositorPorNombreNamed("Denis1");
//		System.out.println(comp);
////		
//		Escritor es=this.escritorservice.buscarEscritorPorNovelaNamed("La guerra de los cielos1");
//		System.out.println(es);
////		
//		Musico mu = this.musicoService.buscarMusicoPorMusicaNamed("Rock1");
//		System.out.println(mu);
//		
//		Productor pr= this.productorService.buscarProductorPorProductoraNamed("Epicentro1");
//		System.out.println(pr);
//		
		
		
//		TAREA 13
		
		
	}

}
