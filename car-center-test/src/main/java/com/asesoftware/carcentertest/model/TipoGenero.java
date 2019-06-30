package com.asesoftware.carcentertest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOS_GENERO")
public class TipoGenero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoGenero;
	@Column(unique = true, nullable = false, length = 50)
	private String nombre;
	private String descripcion;

	public TipoGenero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdTipoGenero() {
		return idTipoGenero;
	}

	public void setIdTipoGenero(Integer idTipoGenero) {
		this.idTipoGenero = idTipoGenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}