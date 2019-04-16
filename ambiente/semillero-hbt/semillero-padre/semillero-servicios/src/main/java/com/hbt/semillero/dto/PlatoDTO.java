package com.hbt.semillero.dto;

import java.io.Serializable;

public class PlatoDTO implements Serializable{
	private int platoId;
	private String platoNombre;
	private int precio;
		
	public PlatoDTO() {
		super();
	}
	
	public PlatoDTO(int platoId, String platoNombre, int precio) {
		super();
		this.platoId = platoId;
		this.platoNombre = platoNombre;
		this.precio = precio;
	}
	

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
