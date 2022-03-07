package ec.edu.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Cliente;
import ec.edu.modelo.FacturaElectronica;
import ec.edu.modelo.Membresia;
import ec.edu.modelo.Pagos;

@Service
public class AdministradorGimnasioServiceImpl implements IAdministradorGimnacioService{

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IMembresiaService membService;

	@Autowired
	private IPagosService pagosService;

	@Autowired
	private IFacturaElectronicaService factElectronicaService;
	
	
	@Override
	public void guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
	
		this.clienteService.insertarCliente(cliente);
		
	}

	@Override
	@Transactional
	public void pagarMembresia(String cedula, String codMembresia) {
		// TODO Auto-generated method stub
		List<Cliente> clientes = new ArrayList<>();

		Cliente cliente = this.clienteService.buscarPorCedula(cedula);
		Membresia membresia = this.membService.buscarPorCodigo(codMembresia);

		Integer cantidad = membresia.getCantidad();
		membresia.setCantidad(cantidad++);
		
		clientes.add(cliente);

		Pagos pago = new Pagos();
		pago.setFechaPago(LocalDateTime.now());
		pago.setValorPAgo(membresia.getValor());
		pago.setCliente(cliente);
		pago.setMembresia(membresia);

		cliente.setEstado("P");
		cliente.setMembresia(membresia);
		membresia.setClientes(clientes);

		FacturaElectronica factura = new FacturaElectronica();
		factura.setCedulaCliente(cliente.getCedula());
		factura.setFechaPago(pago.getFechaPago());
		factura.setValorPago(pago.getValorPAgo());

		this.membService.actualizarMembresia(membresia);
		this.clienteService.actualizarCliente(cliente);
		this.pagosService.insertarRegistroPago(pago);
		this.factElectronicaService.insertarFactElectronica(factura);
	}

}
