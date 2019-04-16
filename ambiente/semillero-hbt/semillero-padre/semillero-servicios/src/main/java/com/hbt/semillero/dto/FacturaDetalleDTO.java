package com.hbt.semillero.dto;

import java.io.Serializable;
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
	private FacturaDTO factura;
	private PlatoDTO plato;
	private BebidaDTO bebida;
	private int precioUnitario;
	/**
	 * constructor
	 */
	public FacturaDetalleDTO(String detalleId, FacturaDTO factura, PlatoDTO plato, BebidaDTO bebida,
	int precio_unitario) {
		super();
		this.detalleId = detalleId;
		this.factura = factura;
		this.plato = plato;
		this.bebida = bebida;
		this.precioUnitario = precio_unitario;
	}
	/**
	 * constructor
	 */
	public FacturaDetalleDTO() {
		super();
	}
	// GETTERS Y SETTERS *******
	public String getDetalle_id() {
		return detalleId;
	}
	public void setDetalle_id(String detalle_id) {
		this.detalleId = detalle_id;
	}
	public FacturaDTO getFactura() {
		return factura;
	}
	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}
	public PlatoDTO getPlato() {
		return plato;
	}
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}
	public BebidaDTO getBebida() {
		return bebida;
	}
	public void setBebida(BebidaDTO bebida) {
		this.bebida = bebida;
	}
	public int getPrecio_unitario() {
		return precioUnitario;
	}
	public void setPrecio_unitario(int precio_unitario) {
		this.precioUnitario = precio_unitario;
	}
	

}
