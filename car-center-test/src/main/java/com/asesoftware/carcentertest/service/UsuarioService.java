package com.asesoftware.carcentertest.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	
	@Transactional
	public Usuario create(Usuario entity) {
		
		entity.setPassword(new BCryptPasswordEncoder().encode(entity.getUsername()));
		entity.setEnabled(true);
		
		return this.repository.save(entity);
	}
	
	public Usuario getUsuario(String username) {
		return this.repository.findByUsername(username);
	}
}
