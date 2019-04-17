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

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal;

@Path("/ServiciosRest")
public class ServiciosRest {

	/**
	 * variable para consultas del EJBean
	 */
	@EJB
	private IConsultasBeanLocal consultasBean;
	
	/**
	 * metodo para consultar todos los  Clientes
	 * @return
	 */
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
/**
 * metodo para consultar las bebidas
 * @return
 */
	@GET
	@Path("/consultarBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BebidaDTO> consultarBebida() {
		List<Bebida> bebidas = consultasBean.consultarBebidas();
		List<BebidaDTO> retorno = new ArrayList<BebidaDTO>();
		for (Bebida bebida : bebidas) {
			BebidaDTO bebidaDTO = construirBebidaDTO(bebida);
			retorno.add(bebidaDTO);
		}
		return retorno;
	}
	
	/**
	 * metodo para consultar las facturas de un cliente
	 * @param IdCliente
	 * @return
	 */
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
	/**
	 * metodo para consultar Todas las Facturas
	 * @return
	 */
		@GET
		@Path("/consultarTodasFacturas")
		@Produces(MediaType.APPLICATION_JSON)
		public List<FacturaDTO> consultarTodasFacturas() {
			List<Factura> facturas = consultasBean.consultarTodasFacturas();
			List<FacturaDTO> retorno = new ArrayList<FacturaDTO>();
			for (Factura factura : facturas) {
				FacturaDTO facturaDTO = construirFacturaDTO(factura);
				retorno.add(facturaDTO);
			}
			return retorno;
		}
		
		/**
		 * metodo para consultar Todas las FacturasDetalles
		 * @return
		 */
			@GET
			@Path("/consultarTodasFacturasDetalles")
			@Produces(MediaType.APPLICATION_JSON)
			public List<FacturaDetalleDTO> consultarTodasFacturasDetalles() {
				List<FacturaDetalle> facturasDetalles = consultasBean.consultarTodasFacturasDetalles();
				List<FacturaDetalleDTO> retorno = new ArrayList<FacturaDetalleDTO>();
				for (FacturaDetalle facturaDetalle : facturasDetalles) {
					FacturaDetalleDTO facturaDetalleDTO = construirFacturaDetalleDTO(facturaDetalle);
					retorno.add(facturaDetalleDTO);
				}
				return retorno;
			}	
	/**
	 * metodo para crear Bebidas
	 * @param bebidaDTO
	 * @return
	 */
	@POST
	@Path("/crearBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO) {
		return consultasBean.crearBebida(bebidaDTO);
	}


	// Metodo construir un cliente
	private ClienteDTO construirClienteDTO(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setClienteId(cliente.getClienteID());
		clienteDTO.setClienteNombre(cliente.getClienteNombre());
		return clienteDTO;
	}
	// Metodo construir una bebida
		private BebidaDTO construirBebidaDTO(Bebida bebida) {
			BebidaDTO bebidaDTO = new BebidaDTO();
			bebidaDTO.setBebidaId(bebida.getBebidaId());
			bebidaDTO.setBebidaNombre(bebida.getBebidaNombre());
			bebidaDTO.setPrecio(bebida.getPrecio());
			return bebidaDTO;
		}

	// Metodo construir una FacturaDTO
	private FacturaDTO construirFacturaDTO(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		facturaDTO.setFacturaId(factura.getFacturaId());
		//facturaDTO.setCliente(factura.getCliente());
		facturaDTO.setIva(factura.getIva());
		facturaDTO.setTotal(factura.getTotal());
		return facturaDTO;
	}
	// Metodo construir todas las  FacturaDetalleDTO
	private FacturaDetalleDTO construirFacturaDetalleDTO(FacturaDetalle facturaDetalle) {
		FacturaDetalleDTO facturaDetalleDTO = new FacturaDetalleDTO();
		facturaDetalleDTO.setDetalleId(facturaDetalle.getDetalleId());
		facturaDetalleDTO.setFactura(facturaDetalle.getFactura());
		facturaDetalleDTO.setPlato(facturaDetalle.getPlato());
		facturaDetalleDTO.setBebida(facturaDetalle.getBebida());
		facturaDetalleDTO.setPrecioUnitario(facturaDetalle.getPrecioUnitario());	
		return facturaDetalleDTO;
	}
	
	/**
	 * Permite eliminar un bebida por Id.
	 * @param idBebida
	 * @return
	 */
	@GET
	@Path("/eliminarBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarBebida(@QueryParam("idBebida") int idBebida) {
		return consultasBean.eliminarBebida(idBebida);
	}


}
