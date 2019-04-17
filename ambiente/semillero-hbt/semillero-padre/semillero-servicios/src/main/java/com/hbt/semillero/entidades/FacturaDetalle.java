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
 * Mapeo de la entidad facutra_detalle
 * @author Sisa
 *
 */
@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "detalle_id")	
	private String detalleId;
	
	
	// lazy perezoso solo trae la de la misma relacion
	// eager  trae todo
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "factura_id")
	private Factura factura;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "plato_id")
	private Plato plato;
	
	@ManyToOne(fetch = FetchType.EAGER)  
	@JoinColumn(name = "bebida_id")
	private Bebida bebida;
	
	@Column(name = "precio_unitario")	
	private int precioUnitario;

	public String getDetalleId() {
		return detalleId;
	}

	public void setDetalleId(String detalleId) {
		this.detalleId = detalleId;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
