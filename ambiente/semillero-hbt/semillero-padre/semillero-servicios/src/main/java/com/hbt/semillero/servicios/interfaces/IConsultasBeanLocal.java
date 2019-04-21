package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

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
/**
 * interface para los metodos necesarios de consulta
 * @author Sisa
 *
 */
@Local
public interface IConsultasBeanLocal {

	/**
	 * metodos a para realizar las consultas
	 * @return
	 */
	public List<Cliente> consultarClientes();
	public ResultadoDTO crearClientes(ClienteDTO clienteDTO);
	
	public List<Factura> consultarTodasFacturas();
	public List<Factura> consultarFacturas(int idCliente);
	public ResultadoDTO crearFacturas(FacturaDTO facturaDTO);
	
	public List<Bebida> consultarBebidas();
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO);
	public List<Plato> consultarPlatos();
	
	public ResultadoDTO eliminarBebida(int idBebida);
	
	public List<FacturaDetalle> consultarTodasFacturasDetalles();
	public ResultadoDTO crearFacturasDetalles(FacturaDetalleDTO facturaDetalleDTO);
	public ResultadoDTO eliminarFacturasDetalles(String detalleId);
	
	
	
}
