package com.hbt.semillero.dto;

import java.io.Serializable;
/**
 * DTO de la clase bebida implementa a serializable
 * @author Sisa
 *
 */
public class BebidaDTO implements Serializable{
	
	/**
	 * atributos de la clase bebida
	 */
	private int bebidaId;
	private String  bebidaNombre;
	private int  precio;
	/**
	 * constructor
	 */
	public BebidaDTO() {
		super();
	}
	/**
	 * constructor
	 */
	public BebidaDTO(int bebidaId, String bebidaNombre, int precio) {
		super();
		this.bebidaId = bebidaId;
		this.bebidaNombre = bebidaNombre;
		this.precio = precio;
	}
	// GETTERS Y SETTERS *******
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
