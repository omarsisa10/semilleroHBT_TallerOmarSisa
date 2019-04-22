package com.hbt.semillero.entidades;

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
 * Mapeo de la entidad facutra_detalle
 * @author Sisa
 *
 */
@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQDETALLE")
//  @SequenceGenerator(sequenceName = "SEQ_COMUN", allocationSize = 1, name = "SEQDETALLE")
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
