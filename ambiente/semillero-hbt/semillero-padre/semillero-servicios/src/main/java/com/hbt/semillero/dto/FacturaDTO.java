package com.hbt.semillero.dto;

import java.io.Serializable;

import com.hbt.semillero.entidades.Cliente;
/**
 * DTO de la clase factura implementa a serializable
 * @author Sisa
 *
 */
public class FacturaDTO implements Serializable {
	/**
	 * atributos de la clase factura
	 */
	private int facturaId;
	private Cliente cliente;
	private int iva;
	private int total;
	/**
	 * constructor
	 */
	public FacturaDTO() {
		super();
	}
	/**
	 * constructor
	 */
	public FacturaDTO(int facturaId, Cliente cliente, int iva, int number) {
		super();
		this.facturaId = facturaId;
		this.cliente = cliente;
		this.iva = iva;
		this.total = number;
	}

	/**
	 * @return the facturaId
	 */
	public int getFacturaId() {
		return facturaId;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @param facturaId the facturaId to set
	 */
	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the iva
	 */
	public int getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}
}
