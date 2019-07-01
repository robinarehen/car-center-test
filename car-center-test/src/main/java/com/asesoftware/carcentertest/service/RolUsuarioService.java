package com.asesoftware.carcentertest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.RolUsuario;
import com.asesoftware.carcentertest.respository.RolUsuarioRepository;

@Service
@Transactional(readOnly = true)
public class RolUsuarioService {

	private RolUsuarioRepository repository;

	public RolUsuarioService(RolUsuarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Transactional
	public RolUsuario create(RolUsuario entity) {
		
		return this.repository.save(entity);
	}
	
}
