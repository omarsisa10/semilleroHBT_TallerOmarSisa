package com.hbt.semillero.servicios.ejb;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
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

}
