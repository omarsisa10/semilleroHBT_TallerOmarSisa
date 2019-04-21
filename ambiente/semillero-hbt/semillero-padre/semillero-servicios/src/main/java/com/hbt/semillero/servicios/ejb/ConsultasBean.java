package com.hbt.semillero.servicios.ejb;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal;
/**
 * clase consultas bean  es un stateless sin estado
 * @author Sisa
 */
@Stateless
public class ConsultasBean implements IConsultasBeanLocal{
/**
 * atributo entity manager para hacer manejo de la base de datos
 */
	@PersistenceContext
	private EntityManager entityManager;
/**
 * metodo que consulta todos los registros de la base de datos	
 */
	@Override
	public List<Cliente> consultarClientes() {
		return entityManager.createQuery("select cli FROM Cliente cli").getResultList();		
	}
	
	/**
	 * metodo que consulta todos los platos 	
	 */
		@Override
		public List<Plato> consultarPlatos() {
			return entityManager.createQuery("select pla FROM Plato pla").getResultList();		
		}
/**
 * metodo  que consulta todas las facturas registradas a un cliente
 */
	@Override
	public List<Factura> consultarFacturas(int idCliente) {
		return entityManager.createQuery("select fac FROM Factura fac where fac.cliente.id =:idCliente").setParameter("idCliente",idCliente ).getResultList();			
	}

	/**
	 * metodo  que consulta todas las bebidas
	 */
	@Override
	public List<Bebida> consultarBebidas() {
		return entityManager.createQuery("select beb FROM Bebida beb").getResultList();			
	}
	
	/**
	 * metodo  que consulta todas las Facturas
	 */
	@Override
	public List<Factura> consultarTodasFacturas() {
		return entityManager.createQuery("select fac FROM Factura fac").getResultList();			
	}
	/**
	 * metodo  que consulta todas las FacturasDetalles
	 */
	@Override
	public List<FacturaDetalle> consultarTodasFacturasDetalles() {
		return entityManager.createQuery("select facDe FROM FacturaDetalle facDe").getResultList();			
	}

	/**
	 * metodo  que consulta todas las facturas registradas a un cliente
	 */
	@Override
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO) {
		try {
			Bebida bebida = asignarAtributosBebida(bebidaDTO);		
			entityManager.persist(bebida);			
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "bebida Creada de forma exitosa");
	}
	
	/**
	 * metodo  que crear facturasDetalle
	 */
	@Override
	public ResultadoDTO crearFacturasDetalles(FacturaDetalleDTO facturaDetalleDTO) {
		try {
			FacturaDetalle facturaDetalle = asignarAtributosFacturasDetalles(facturaDetalleDTO);		
			entityManager.persist(facturaDetalle);			
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "facturaDetalle Creada de forma exitosa");
	}
	
	/**
	 * metodo para crear clientes
	 */
	@Override
	public ResultadoDTO crearClientes(ClienteDTO clienteDTO) {
		try {
			Cliente cliente = asignarAtributosCliente(clienteDTO);		
			entityManager.persist(cliente);			
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "Cliente Creado de forma exitosa");
	}
	
	/**
	 * metodo para crear factura
	 */
	@Override
	public ResultadoDTO crearFacturas(FacturaDTO facturaDTO) {
		try {
			Factura factura = asignarAtributosFactura(facturaDTO);		
			entityManager.persist(factura);			
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "factura Creado de forma exitosa");
	}
	
	
	
	/**
	 * metodo asgignar atributos a una bebida crear una bebida
	 * @param bebidaDTO
	 * @return
	 */
	private Bebida asignarAtributosBebida(BebidaDTO bebidaDTO) {
		Bebida bebida = new Bebida();
		bebida.setBebidaId(bebidaDTO.getBebidaId());
		bebida.setBebidaNombre(bebidaDTO.getBebidaNombre());
		bebida.setPrecio(bebidaDTO.getPrecio());		
		return bebida;
	}

	
	/**
	 * metodo asgignar atributos a un cliente
	 * @param bebidaDTO
	 * @return
	 */
	private Cliente asignarAtributosCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setClienteID(clienteDTO.getClienteId());
		cliente.setClienteNombre(clienteDTO.getClienteNombre());				
		return cliente;
	}
	/**
	 * metodo asgignar atributos a FacturasDetalle
	 * @param bebidaDTO
	 * @return
	 */
	private FacturaDetalle asignarAtributosFacturasDetalles(FacturaDetalleDTO facturaDetalleDTO) {
		FacturaDetalle facturaDetalle = new FacturaDetalle();
		facturaDetalle.setDetalleId(facturaDetalleDTO.getDetalleId());
		facturaDetalle.setFactura(facturaDetalleDTO.getFactura());
		facturaDetalle.setPlato(facturaDetalleDTO.getPlato());
		facturaDetalle.setBebida(facturaDetalleDTO.getBebida());
		facturaDetalle.setPrecioUnitario(facturaDetalleDTO.getPrecioUnitario());
		return facturaDetalle;
	}
	
	/**
	 * metodo asgignar atributos a una Factura	 
	 * @return
	 */
	private Factura asignarAtributosFactura(FacturaDTO facturaDTO) {
		Factura factura = new Factura();
		factura.setFacturaId(facturaDTO.getFacturaId());
		factura.setIva(facturaDTO.getIva());
		factura.setTotal(facturaDTO.getTotal());			
		List<Cliente> clientes = entityManager.createQuery("Select cli from Cliente cli where cli.clienteId=:clienteId ")
				.setParameter("clienteId", facturaDTO.getCliente().getClienteID()).getResultList();
		if (clientes.size() == 1) {
			factura.setCliente(clientes.get(0));
		}
	
		return factura;
	}
/**
 * metodo para eliminar una bebida ingresando por parametro el id de la bebida
 */	
	@Override
	public ResultadoDTO eliminarBebida(int idBebida) {
		try {
			entityManager.remove(entityManager.find(Bebida.class, idBebida));
			return new ResultadoDTO(true, "Bebida Eliminada de froma exitosa");
		} catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
	}
	/**
	 * metodo para eliminar una bebida ingresando por parametro el id detalleFactura
	 */	
		@Override
		public ResultadoDTO eliminarFacturasDetalles(String detalleId) {
			try {
				entityManager.remove(entityManager.find(FacturaDetalle.class, detalleId));
				return new ResultadoDTO(true, "FacturaDetalle Eliminada de froma exitosa");
			} catch (Exception e) {
				return new ResultadoDTO(false, e.getMessage());
			}
		}

}
