package com.asesoftware.carcentertest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "USUARIOS")
public class Usuario {

	private static final String STATUS_ACTIVO = "ACTIVO";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuaio;

	@JoinColumn(name = "id_persona", unique = true)
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private DatosPersona datosPersona;

	@JoinColumn(name = "id_tipo_estado")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TipoEstado tipoEstado;

	@Column(unique = true, nullable = false, length = 20)
	private String username;

	@Column(nullable = false)
	private String password;
	
	@Transient
	private boolean enabled;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdUsuaio() {
		return idUsuaio;
	}

	public void setIdUsuaio(Integer idUsuaio) {
		this.idUsuaio = idUsuaio;
	}

	public DatosPersona getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersona datosPersona) {
		this.datosPersona = datosPersona;
	}

	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		
		if (this.tipoEstado != null) {
			this.enabled = (this.tipoEstado.getNombre().toUpperCase().equals(STATUS_ACTIVO));
		}
		
		return enabled;
	}

}
