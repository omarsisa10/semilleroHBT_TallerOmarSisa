package com.hbt.semillero.dto;

import java.io.Serializable;

public class BebidaDTO implements Serializable{
	private int bebidaId;
	private String  bebidaNombre;
	private int  precio;
	
	public BebidaDTO() {
		super();
	}
	public BebidaDTO(int bebidaId, String bebidaNombre, int precio) {
		super();
		this.bebidaId = bebidaId;
		this.bebidaNombre = bebidaNombre;
		this.precio = precio;
	}
	public int getBebidaId() {
		return bebidaId;
	}
	public void setBebidaId(int bebidaId) {
		this.bebidaId = bebidaId;
	}
	public String getBebidaNombre() {
		return bebidaNombre;
	}
	public void setBebidaNombre(String bebidaNombre) {
		this.bebidaNombre = bebidaNombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}
