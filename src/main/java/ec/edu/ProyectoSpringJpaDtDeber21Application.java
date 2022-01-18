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
		//metodos de insercion
		Artista a1 = new Artista();
		a1.setNombre("Dennis");
		a1.setApellido("Tapia");
		this.artistaService.guardarArtista(a1);
		
		Compositor c1 = new Compositor();
		c1.setNombre("Denis");
		c1.setGenero_musical("Rock");
		this.compositorService.guardadCompositor(c1);
		
		Escritor e1 = new Escritor();
		e1.setNombre("Denis");
		e1.setNovela("La guerra de los cielos");
		this.escritorservice.guardarEscritor(e1);
		
		Musico m1 = new Musico();
		m1.setMusica("Rock");
		m1.setNombre("Dennis");
		this.musicoService.guardarMusico(m1);
		
		Productor p1 = new Productor();
		p1.setNombre("Dennis");
		p1.setProductora("Epicentro");
		this.productorService.guardarProductor(p1);
		
		
		//metodos actualizar
		
		Artista a2 = new Artista();
		a2.setId(5);
		a2.setNombre("Javier");
		a2.setApellido("Tapia");
		this.artistaService.modificarArtista(a2);
		
		Compositor c2 = new Compositor();
		c2.setId(6);
		c2.setNombre("Javier");
		c2.setGenero_musical("Rock");
		this.compositorService.modificarCompositor(c2);
		
		Escritor e2 = new Escritor();
		c2.setId(9);
		e2.setNombre("Javier");
		e2.setNovela("La guerra de los cielos");
		this.escritorservice.modificarEscritor(e2);
		
		Musico m2 = new Musico();
		m2.setId(10);
		m2.setMusica("Rock");
		m2.setNombre("Javier");
		this.musicoService.modificarMusico(m2);
		
		Productor p2 = new Productor();
		p2.setId(11);
		p2.setNombre("Javier");
		p2.setProductora("Epicentro");
		this.productorService.modificarProductor(p2);
		
		
	}

}
