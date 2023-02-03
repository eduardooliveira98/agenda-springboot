package br.com.agendaonline.service;

import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

		private Boolean system = true;
		private final UsuarioService usuarioRepository;
		
		public UsuarioService(UsuarioService usuarioRepository) {
			this.usuarioRepository = usuarioRepository;
		}
	}
