package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Mapeo de la entidad Bebida
 * @author Sisa
 *
 */
@Entity
@Table(name = "BEBIDA")
public class Bebida {
	
	private static final long serialVersionUID = 1L;
	/**
	 * atributos de la entidad bebida
	 */
	//@GeneratedValue(strategy=GenerationType.AUTO) 
	@Id
	@Column(name = "bebida_id")
	private int bebidaId;
	
	@Column(name = "bebida_nombre")
	private String  bebidaNombre;
	
	@Column(name = "precio")
	private int precio;
	
	// GETTERS Y SETTERS **************

	/**
	 * @return the bebidaId
	 */
	public int getBebidaId() {
		return bebidaId;
	}

	/**
	 * @param bebidaId the bebidaId to set
	 */
	public void setBebidaId(int bebidaId) {
		this.bebidaId = bebidaId;
	}

	/**
	 * @return the bebidaNombre
	 */
	public String getBebidaNombre() {
		return bebidaNombre;
	}

	/**
	 * @param bebidaNombre the bebidaNombre to set
	 */
	public void setBebidaNombre(String bebidaNombre) {
		this.bebidaNombre = bebidaNombre;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

	
	
	
	
}
