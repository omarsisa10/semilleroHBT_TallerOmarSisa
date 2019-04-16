package com.hbt.semillero.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal;

@Path("/ServiciosRest")
public class ServiciosRest {

	/**
	 * variable para consultas del EJBean
	 */
	@EJB
	private IConsultasBeanLocal consultasBean;

	@GET
	@Path("/consultarClientes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteDTO> consultarClientes() {
		List<Cliente> clientes = consultasBean.consultarClientes();
		List<ClienteDTO> retorno = new ArrayList<ClienteDTO>();
		for (Cliente cliente : clientes) {
			ClienteDTO clienteDTO = construirClienteDTO(cliente);
			retorno.add(clienteDTO);
		}
		return retorno;
	}

	// factura
	@GET
	@Path("/consultarFacturas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDTO> consultarFacturas(@QueryParam(value = "idCliente") int IdCliente) {
		List<Factura> facturas = consultasBean.consultarFacturas(IdCliente);
		List<FacturaDTO> retorno = new ArrayList<FacturaDTO>();
		for (Factura factura : facturas) {
			FacturaDTO facturaDTO = construirFacturaDTO(factura);
			retorno.add(facturaDTO);
		}
		return retorno;
	}

	// Metodo construir una cliente
	private ClienteDTO construirClienteDTO(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setClienteId(cliente.getClienteID());
		clienteDTO.setClienteNombre(cliente.getClienteNombre());
		return clienteDTO;
	}

	// Metodo construir una cliente
	private FacturaDTO construirFacturaDTO(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		facturaDTO.setFacturaId(factura.getFacturaId());
		//facturaDTO.setCliente(factura.getCliente());
		facturaDTO.setIva(factura.getIva());
		facturaDTO.setTotal(factura.getTotal());
		return facturaDTO;
	}

}
