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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DATOS_PERSONALES", 
	uniqueConstraints = @UniqueConstraint(columnNames = {"id_tipo_identificacion", "numeroIdentificacion"})
)
public class DatosPersona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;

	@JoinColumn(name = "id_tipo_persona", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TipoPersona tipoPersona;

	@JoinColumn(name = "id_tipo_identificacion", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TipoIdentificacion tipoIdentificacion;

	@JoinColumn(name = "id_tipo_genero", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TipoGenero tipoGenero;

	@JoinColumn(name = "id_tipo_estado", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TipoEstado tipoEstado;

	@Column(nullable = false, length = 20)
	private Integer numeroIdentificacion;
	@Column(nullable = false, length = 50)
	private String nombres;
	@Column(nullable = false, length = 50)
	private String primerApellido;
	private String segundoApellido;

	public DatosPersona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public TipoGenero getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(TipoGenero tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	public Integer getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(Integer numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

}
