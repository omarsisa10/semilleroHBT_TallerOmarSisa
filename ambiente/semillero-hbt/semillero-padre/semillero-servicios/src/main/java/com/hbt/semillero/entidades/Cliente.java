package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Mapeo de la entidad Cliente
 * @author Sisa
 *
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cliente_id")	
	private int clienteID;
	
	@Column(name = "cliente_nombre")
	private String clienteNombre;

	// GETTERS Y SETTERS *******
	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public String getClienteNombre() {
		return clienteNombre;
	}

	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	
}
