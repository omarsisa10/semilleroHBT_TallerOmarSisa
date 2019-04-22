package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * Mapeo de la entidad Factura
 * @author Sisa
 *
 */
@Entity
@Table(name = "FACTURA")
public class Factura {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    @SequenceGenerator(sequenceName = "SEQ_COMUN", allocationSize = 1, name = "SEQ")
	@Column(name = "factura_id")	
	private int facturaId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@Column(name = "iva")
	private int iva;
	
	@Column(name = "total")
	private int total;
	// GETTERS Y SETTERS *******

	/**
	 * @return the facturaId
	 */
	public int getFacturaId() {
		return facturaId;
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
	
	
}
