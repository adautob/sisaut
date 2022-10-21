package com.csv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csv.model.Usuario;
import com.csv.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
		
	}

}
