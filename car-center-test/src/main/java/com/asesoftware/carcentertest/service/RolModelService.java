package com.asesoftware.carcentertest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.RolModel;
import com.asesoftware.carcentertest.respository.RolModelRepository;

@Service
@Transactional(readOnly = true)
public class RolModelService {

	private RolModelRepository repository;

	public RolModelService(RolModelRepository repository) {
		super();
		this.repository = repository;
	}

	public RolModel getFindNombre(String nombreRol) {
		return this.repository.findByNombre(nombreRol);
	}
}
