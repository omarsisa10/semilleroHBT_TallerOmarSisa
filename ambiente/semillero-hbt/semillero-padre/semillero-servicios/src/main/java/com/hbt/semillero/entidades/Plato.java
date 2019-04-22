package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Mapeo de la entidad Plato
 * @author Sisa
 *
 */
@Entity
@Table(name = "PLATO")
public class Plato {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name = "plato_id")
private int platoId;

@Column(name = "plato_nombre")
private String platoNombre;

@Column(name = "precio")
private  int precio;

@Column(name = "plato_descripcion")
private String platoDescripcion;

//GETTERS Y SETTERS ********************
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
