package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
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
	public List<Factura> consultarFacturas(int idCliente);
	public List<Bebida> consultarBebidas();
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO);
	public ResultadoDTO eliminarBebida(int idBebida);
	public List<Factura> consultarTodasFacturas();
	public List<FacturaDetalle> consultarTodasFacturasDetalles();
}
