package com.asesoftware.carcentertest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.Cliente;
import com.asesoftware.carcentertest.model.DatosPersona;
import com.asesoftware.carcentertest.respository.ClienteRepository;

@Service
@Transactional(readOnly = true)
public class ClienteService {

	private ClienteRepository repository;

	public ClienteService(ClienteRepository repository) {
		super();
		this.repository = repository;
	}

	@Transactional
	public Cliente create(Cliente entity) {
		return this.repository.save(entity);
	}
	
	public Cliente getFindByPersona(DatosPersona datosPersona) {
		return this.repository.findByDatosPersona(datosPersona);
	}
}
