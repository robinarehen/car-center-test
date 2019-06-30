package com.asesoftware.carcentertest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.TipoPersona;
import com.asesoftware.carcentertest.respository.TipoPersonaRepository;

@Service
@Transactional(readOnly = true)
public class TipoPersonaService {

	private TipoPersonaRepository repository;

	public TipoPersonaService(TipoPersonaRepository repository) {
		super();
		this.repository = repository;
	}

	public TipoPersona getTipoPersona(String tipoPersona) {
		
		return this.repository.findByNombre(tipoPersona);
	}
}
