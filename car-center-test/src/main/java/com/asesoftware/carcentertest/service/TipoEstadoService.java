package com.asesoftware.carcentertest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.TipoEstado;
import com.asesoftware.carcentertest.respository.TipoEstadoRepository;

@Service
@Transactional(readOnly = true)
public class TipoEstadoService {

	private TipoEstadoRepository repository;

	public TipoEstadoService(TipoEstadoRepository repository) {
		super();
		this.repository = repository;
	}

	public TipoEstado getEstado(String nombreTabla, String nombreEstado) {
		
		return this.repository.findByNombreTablaAndNombre(nombreTabla, nombreEstado);
	}
}
