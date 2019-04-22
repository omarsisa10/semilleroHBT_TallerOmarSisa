package com.hbt.semillero.dto;

import java.io.Serializable;

import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.Plato;
/**
 * DTO de la clase factura implementa a serializable
 * @author Sisa
 *
 */
public class FacturaDetalleDTO implements Serializable {
	/**
	 * atributos de la clase factura
	 */
	private String detalleId;
	private Factura factura;
	private Plato plato;
	private Bebida bebida;
	private int precioUnitario;
	/**
	 * Constructor con todos los parametros
	 * @param detalleId
	 * @param factura
	 * @param plato
	 * @param bebida
	 * @param precioUnitario
	 */
	public FacturaDetalleDTO(String detalleId, Factura factura, Plato plato, Bebida bebida, int precioUnitario) {
		super();
		this.detalleId = detalleId;
		this.factura = factura;
		this.plato = plato;
		this.bebida = bebida;
		this.precioUnitario = precioUnitario;
	}
	
	public FacturaDetalleDTO(Factura factura, Plato plato, Bebida bebida, int precioUnitario) {
		super();
		this.factura = factura;
		this.plato = plato;
		this.bebida = bebida;
		this.precioUnitario = precioUnitario;
	}

	/**
	 * constructor sin parametros
	 */
	public FacturaDetalleDTO() {
		super();
	}
	/**
	 * @return the detalleId
	 */
	public String getDetalleId() {
		return detalleId;
	}
	/**
	 * @param detalleId the detalleId to set
	 */
	public void setDetalleId(String detalleId) {
		this.detalleId = detalleId;
	}
	/**
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}
	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	/**
	 * @return the plato
	 */
	public Plato getPlato() {
		return plato;
	}
	/**
	 * @param plato the plato to set
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	/**
	 * @return the bebida
	 */
	public Bebida getBebida() {
		return bebida;
	}
	/**
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	/**
	 * @return the precioUnitario
	 */
	public int getPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	

}
