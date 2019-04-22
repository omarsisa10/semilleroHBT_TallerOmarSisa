package com.hbt.semillero.dto;

import java.io.Serializable;
/**
 * DTO de la clase plato implementa a serializable
 * @author Sisa
 *
 */
public class PlatoDTO implements Serializable{
	/**
	 * atributos de la clase plato
	 */
	private int platoId;
	private String platoNombre;
	private int precio;
	private String platoDescripcion;
	/**
	 * constructor
	 */
	public PlatoDTO() {
		super();
	}

	/**
	 * constructor
	 */
	public PlatoDTO(int platoId, String platoNombre, int precio, String platoDescripcion) {
		super();
		this.platoId = platoId;
		this.platoNombre = platoNombre;
		this.precio = precio;
		this.platoDescripcion = platoDescripcion;
	}
	
	// GETTERS Y SETTERS *******
	/**
	 * @return the platoId
	 */
	public int getPlatoId() {
		return platoId;
	}
	/**
	 * @param platoId the platoId to set
	 */
	public void setPlatoId(int platoId) {
		this.platoId = platoId;
	}
	/**
	 * @return the platoNombre
	 */
	public String getPlatoNombre() {
		return platoNombre;
	}
	/**
	 * @param platoNombre the platoNombre to set
	 */
	public void setPlatoNombre(String platoNombre) {
		this.platoNombre = platoNombre;
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
	/**
	 * @return the platoDescripcion
	 */
	public String getPlatoDescripcion() {
		return platoDescripcion;
	}
	/**
	 * @param platoDescripcion the platoDescripcion to set
	 */
	public void setPlatoDescripcion(String platoDescripcion) {
		this.platoDescripcion = platoDescripcion;
	}



}
