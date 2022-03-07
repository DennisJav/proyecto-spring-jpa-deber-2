package ec.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Artista;
import ec.edu.modelo.Cliente;
import ec.edu.modelo.Compositor;
import ec.edu.modelo.Consumo;
import ec.edu.modelo.CuentaBancaria;
import ec.edu.modelo.CuentaHabiente;
import ec.edu.modelo.DetalleServicio;
import ec.edu.modelo.Egresado;
import ec.edu.modelo.Escritor;
import ec.edu.modelo.Jefe;
import ec.edu.modelo.Membresia;
import ec.edu.modelo.Musico;
import ec.edu.modelo.Oficina;
import ec.edu.modelo.Productor;
import ec.edu.modelo.Servicio;
import ec.edu.modelo.TarjetaDeCredito;
import ec.edu.modelo.Tesis;
import ec.edu.service.IAdministradorGimnacioService;
import ec.edu.service.IArtistaService;
import ec.edu.service.ICajeroBancarioService;
import ec.edu.service.IClienteService;
import ec.edu.service.ICompositorService;
import ec.edu.service.ICuentaBancariaService;
import ec.edu.service.ICuentaHabienteService;
import ec.edu.service.IEgresadoService;
import ec.edu.service.IEscritorService;
import ec.edu.service.IMembresiaService;
import ec.edu.service.IMusicoService;
import ec.edu.service.IOficinaService;
import ec.edu.service.IProductorService;
import ec.edu.service.IServicioService;
import ec.edu.service.ITarjetaDeCreditoService;

@SpringBootApplication
public class ProyectoSpringJpaDtDeber21Application implements CommandLineRunner {

	public static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaDtDeber21Application.class);

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

	@Autowired
	private IServicioService servicioService;

	@Autowired
	private IOficinaService oficinaService;

	@Autowired
	private IEgresadoService egresadoService;
	
	@Autowired
	private ITarjetaDeCreditoService tarjetaService;
	
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private ICuentaHabienteService cuentaHabienteService;
	
	@Autowired
	private ICajeroBancarioService cajeroBancarioService;
	
	@Autowired
	private IAdministradorGimnacioService administradorGimnasio;
	
	@Autowired
	private IMembresiaService membresiaService;
	
	@Autowired
	private IClienteService clienteService;
	

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

		// metodos actualizar

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
		//
		// metodos de borrar

//		this.artistaService.borrar(36);
//		
//		this.compositorService.borrarCompositor(35);
//		
//		this.escritorservice.borrarEscritor(37);
//		
//		this.musicoService.borrarMusico(37);
//		
//		this.productorService.borrarProductor(36);

		// metodos buscar

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

		// metodos de busqueda por atributo JPQL

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
//		
//		Artista art = this.artistaService.buscarPorApellidoNativeQuery("Tapia1");
//		System.out.println(art);
////	
//		Compositor comp = this.compositorService.buscarCompositorPorNombreNativeQuery("Denis1");
//		System.out.println(comp);
////		
//		Escritor es=this.escritorservice.buscarEscritorPorNovelaNativeQuery("La guerra de los cielos1");
//		System.out.println(es);
////		
//		Musico mu = this.musicoService.buscarMusicoPorMusicaNativeQuery("Rock1");
//		System.out.println(mu);
//		
//		Productor pr= this.productorService.buscarProductorPorProductoraNativeQuery("Epicentro1");
//		System.out.println(pr);

//		TAREA 14

////		List<Guardia> listaGuardia = this.guardiaService.buscarPorApellidoCriteriaAPIOR("Tapia","JAVA2");
////		for(Guardia g: listaGuardia) {
////			LOG.info("ESTE ES EL GUARDIA: " + g);
//		
//		List<Artista> art = this.artistaService.buscarPorApellidoCriteriaApi("Tapia1");
//		for(Artista a: art) {
//			LOG.info("Este es el resultado de busqueda: "+a);
//		}
////	
//		List<Compositor> comp = this.compositorService.buscarCompositorPorNombreCriteriaApi("Denis1");
//		for(Compositor c: comp) {
//			LOG.info("Este es el resultado de busqueda: "+c);
//		}
////		
//		List<Escritor> es=this.escritorservice.buscarEscritorPorNovelaCriteriaApi("La guerra de los cielos1");
//		for(Escritor e: es) {
//			LOG.info("Este es el resultado de busqueda: "+e);
//		}
////		
//		List<Musico> mu = this.musicoService.buscarMusicoPorMusicaCriteriaApi("Rock1");
//		for(Musico m: mu) {
//			LOG.info("Este es el resultado de busqueda: "+m);
//		}
//		
//		List<Productor> pr= this.productorService.buscarProductorPorProductoraCriteriaApi("Epicentro1");
//		for(Productor p: pr) {
//			LOG.info("Este es el resultado de busqueda: "+p);
//		}	
//		
//		//Tarea 15
//		Servicio servicioTecnico = new Servicio();
//		servicioTecnico.setNumero("1-1111");
//		servicioTecnico.setNombre("Dennis");
//		LocalDateTime miFecha = LocalDateTime.now();
//		servicioTecnico.setFecha(miFecha);
//		
//		List<DetalleServicio> detalles =  new ArrayList<>();
//		
//		//equipo1
//		DetalleServicio d1 = new DetalleServicio();
//		d1.setEquipo("EPSON WF2830");
//		d1.setError("No enciende");
//		d1.setPrecio(new BigDecimal(22.5));
//		d1.setServicio(servicioTecnico);
//		
//		detalles.add(d1);
//		
//		//equipo2
//		DetalleServicio d2 = new DetalleServicio();
//		d2.setEquipo("CANON");
//		d2.setError("Reset");
//		d2.setPrecio(new BigDecimal(65.5));
//		d2.setServicio(servicioTecnico);
//		
//		detalles.add(d2);
//		servicioTecnico.setDetalles(detalles);
//		
//		this.servicioService.guardarServicio(servicioTecnico);

//		// Tarea 16
//		
////		Modelo 1
//		
//		Oficina oficina1 = new Oficina();
//		oficina1.setNombre("Bufet 1");
//		oficina1.setNumero("E1");
//		oficina1.setPiso("1");
//		
//		Jefe jefe1 = new Jefe();
//		jefe1.setNombre("Dennis");
//		jefe1.setApellido("Tapia");
//		jefe1.setDepartamento("Inges");
//		
//		jefe1.setOficina(oficina1);
//		oficina1.setJefe(jefe1);
//		this.oficinaService.guardarOficina(oficina1);
//		
//		
//// 		Modelo 2
//		
//		Egresado egresado1 = new Egresado();
//		egresado1.setNombre("Javier1");
//		egresado1.setApellido("Tapia");
//		egresado1.setFacultad("Ingenieria");
//		
//		Tesis tesis1 = new Tesis();
//		tesis1.setAutor("Javier1");
//		tesis1.setTitulo("Ingenieria de control");
//		tesis1.setFacultad("Ingenieria");
//		
//		egresado1.setTesis(tesis1);
//		tesis1.setEgresado(egresado1);
//		this.egresadoService.guardarEgresado(egresado1);

		// Tarea 17
////
//
//		this.egresadoService.buscarPorNombreJoin("Javier1");
//		this.egresadoService.buscarPorNombreJoinLeft("Javier1");
//		this.egresadoService.buscarPorNombreJoinRight("Javier1");
//		this.egresadoService.buscarPorNombreWhere("Javier1");
	

		//TAREA 21
//		
//		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito();
////		tarjeta1.setCedulaPropietario("1715078984");
////		tarjeta1.setCupo(new BigDecimal(1000));
////		tarjeta1.setNumeroTarjeta("111");
////		
////		this.tarjetaService.guardarTarjeta(tarjeta1);
////		
//		TarjetaDeCredito tarjeta2 = new TarjetaDeCredito();
//		tarjeta2.setCedulaPropietario("1000100010");
//		tarjeta2.setCupo(new BigDecimal(1000));
//		tarjeta2.setNumeroTarjeta("222");
////		
//		this.tarjetaService.guardarTarjeta(tarjeta2);
//		
//		
//		TarjetaDeCredito tarjeta = this.tarjetaService.buscaTarjetaPorNumero("123");
//		System.out.println("tarjeta: "+tarjeta);
//
		
		
//		TAREA 22
//		//Consumo 1
//
//		LocalDateTime fechaCompra = LocalDateTime.now();
//		Consumo c1 = new Consumo();
//		c1.setValorConsumo(new BigDecimal(10));
//		c1.setFechaConsumo(fechaCompra);
//		
//		this.tarjetaService.realizarCompra("123", c1);
		
		
////		TAREA 23
//		
////		//cuenta 1
//		CuentaHabiente cuentaHabiente = new CuentaHabiente();
//		cuentaHabiente.setApellido("Tapia");
//		cuentaHabiente.setCedula("17213346861");
//		cuentaHabiente.setNombre("Dennis");
//
//		
//		CuentaBancaria cuentaBancaria = new CuentaBancaria();
//		cuentaBancaria.setNumeroCuenta("7");
//		cuentaBancaria.setSaldo(new BigDecimal("1000"));
//		cuentaBancaria.setTipo("AHORRO");
//		cuentaBancaria.setCuentaHabiente(cuentaHabiente);
//		
//		List<CuentaBancaria> cuentas = new ArrayList<>();
//		cuentas.add(cuentaBancaria);
//		cuentaHabiente.setCuentaBancarias(cuentas);
//		this.cuentaHabienteService.insertarCuentaHabiente(cuentaHabiente);
//////		
//////		//cuenta 2
//		CuentaHabiente cuentaHabiente2 = new CuentaHabiente();
//		cuentaHabiente2.setApellido("Ortiz");
//		cuentaHabiente2.setCedula("1726223223");
//		cuentaHabiente2.setNombre("Javier");
//
//		CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
//		cuentaBancaria2.setNumeroCuenta("8");
//		cuentaBancaria2.setSaldo(new BigDecimal("2000"));
//		cuentaBancaria2.setTipo("Corriente");
//		cuentaBancaria2.setCuentaHabiente(cuentaHabiente2);
//		
//		
//		List<CuentaBancaria> cuenta = new ArrayList<>();
//		cuenta.add(cuentaBancaria2);
//		cuentaHabiente2.setCuentaBancarias(cuenta);
//		this.cuentaHabienteService.insertarCuentaHabiente(cuentaHabiente2);
////		
////		
////		//Consultar por numero de cedula
//		List<CuentaBancaria> listBancarias = this.cajeroBancarioService.consultarCuentas("17213346861");
//		listBancarias.stream().forEach(c->LOG.info(c.toString()));
//		 //Retirar Dinero por numero de cuenta y el valor
//		this.cajeroBancarioService.retirarDinero("3", new BigDecimal("100"));
//		this.cajeroBancarioService.retirarDinero("4", new BigDecimal("30"));
////		//Consultar el saldo
//		String numeroCuenta = "3";
//		LOG.info("El saldo de la cuenta: "+numeroCuenta +" es: " + this.cajeroBancarioService.consultarSaldo(numeroCuenta));
////		

//		
		
		//Tarea 24
		
		LocalDateTime miFecha = LocalDateTime.of(1996, Month.JANUARY, 16, 8, 00);

		Cliente c1 = new Cliente();
		c1.setNombre("Dennis");
		c1.setApellido("Tapia");
		c1.setCedula("172134686");
		c1.setFechaNacimiento(miFecha);
		c1.setEstado("N");

		Cliente c2 = new Cliente();
		c2.setNombre("Javier");
		c2.setApellido("Ortiz");
		c2.setCedula("1721322222");
		c2.setFechaNacimiento(LocalDateTime.of(1996, Month.AUGUST, 22, 10, 45));
		c2.setEstado("N");
		
		Cliente c3 = new Cliente();
		c3.setNombre("Liz");
		c3.setApellido("Peri");
		c3.setCedula("1225551");
		c3.setFechaNacimiento(LocalDateTime.of(2002, Month.JULY, 13, 13, 13));
		c3.setEstado("N");

		Cliente c4 = new Cliente();
		c4.setNombre("juan");
		c4.setApellido("Mela");
		c4.setCedula("322231511");
		c4.setFechaNacimiento(LocalDateTime.of(1993, Month.APRIL, 8, 20, 45));
		c4.setEstado("N");

		this.administradorGimnasio.guardarCliente(c1);
		this.administradorGimnasio.guardarCliente(c2);
		
		this.administradorGimnasio.guardarCliente(c3);
		this.administradorGimnasio.guardarCliente(c4);

		
		Membresia m1 = new Membresia();
		m1.setCodigo("m1");
		m1.setNombre("Membrecia Platinum");
		m1.setValor(new BigDecimal(10));
		m1.setVigencia(LocalDateTime.of(2023, Month.MARCH, 12, 0, 0));
		m1.setCantidad(0);
		
		Membresia m2 = new Membresia();
		m2.setCodigo("m2");
		m2.setNombre("Membrecia Estandar");
		m2.setValor(new BigDecimal(10));
		m2.setVigencia(LocalDateTime.of(2022, Month.JULY, 12, 0, 0));
		m2.setCantidad(0);

		this.membresiaService.insertarMembresia(m1);
		this.membresiaService.insertarMembresia(m2);

		this.administradorGimnasio.pagarMembresia("172134686", "m1");
		this.administradorGimnasio.pagarMembresia("1225551", "m1");
		this.administradorGimnasio.pagarMembresia("322231511", "m2");
		
		
		
		
		
	}

}
