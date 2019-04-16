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
	/**
	 * constructor
	 */
	public PlatoDTO() {
		super();
	}
	/**
	 * constructor
	 */
	public PlatoDTO(int platoId, String platoNombre, int precio) {
		super();
		this.platoId = platoId;
		this.platoNombre = platoNombre;
		this.precio = precio;
	}
	
	// GETTERS Y SETTERS *******
	public int getPlatoId() {
		return platoId;
	}
	public void setPlatoId(int platoId) {
		this.platoId = platoId;
	}
	public String getPlato_nombre() {
		return platoNombre;
	}
	public void setPlato_nombre(String plato_nombre) {
		this.platoNombre = plato_nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
