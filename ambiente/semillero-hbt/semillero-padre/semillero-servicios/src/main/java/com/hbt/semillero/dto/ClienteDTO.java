package com.hbt.semillero.dto;

import java.io.Serializable;
/**
 * DTO de la clase cliente implementa a serializable
 * @author Sisa
 *
 */
public class ClienteDTO  implements Serializable {
	
	/**
	 * atributos de la clase cliente
	 */
	private int clienteId;
	private String  clienteNombre;
	
	
	/**
	 * constructor
	 */
	public ClienteDTO() {
		super();
	}
	
	/**
	 * constructor
	 */
	public ClienteDTO(String clienteNombre) {
		super();
		this.clienteNombre = clienteNombre;
	}


	// GETTERS Y SETTERS *******	
	/**
	 * @return the clienteId
	 */
	public int getClienteId() {
		return clienteId;
	}
	/**
	 * @param clienteId the clienteId to set
	 */
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	/**
	 * @return the clienteNombre
	 */
	public String getClienteNombre() {
		return clienteNombre;
	}
	/**
	 * @param clienteNombre the clienteNombre to set
	 */
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}

}
