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
