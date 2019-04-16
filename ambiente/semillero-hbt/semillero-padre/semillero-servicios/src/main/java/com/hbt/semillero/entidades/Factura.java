package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "factura_id")	
	private int facturaId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@Column(name = "iva")
	private int iva;
	
	@Column(name = "total")
	private int total;
	// GETTERS Y SETTERS *******
	public int getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
