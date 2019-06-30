package com.asesoftware.carcentertest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asesoftware.carcentertest.model.Usuario;
import com.asesoftware.carcentertest.respository.UsuarioRepository;

@Service
@Transactional(readOnly = true)
public class UsuarioService {

	private UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Usuario create(Usuario entity) {		
		return this.repository.save(entity);
	}
}
