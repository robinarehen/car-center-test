package com.asesoftware.carcentertest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.TipoIdentificacion;
import com.asesoftware.carcentertest.respository.TipoIdentificacionRepository;

@Service
@Transactional(readOnly = true)
public class TipoIdentificacionService {

	private TipoIdentificacionRepository repository;

	public TipoIdentificacionService(TipoIdentificacionRepository repository) {
		super();
		this.repository = repository;
	}

	public List<TipoIdentificacion> getFindAll() {
		return this.repository.findAll();
	}
}
