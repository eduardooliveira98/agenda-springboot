package br.com.agendaonline.AgendaOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.agendaonline.service.ListasService;
import br.com.agendaonline.service.TarefasService;
import br.com.agendaonline.service.UsuarioService;


@SpringBootApplication
public class AgendaOnlineApplication {
	
	private Boolean system = true;

	private final UsuarioService usuarioService;
	
	private final TarefasService tarefasService;
	
	private final ListasService listasService;
	
	public AgendaOnlineApplication(UsuarioService usuarioService, TarefasService tarefasService, ListasService listasService) {
		this.usuarioService = usuarioService;
		this.tarefasService = tarefasService;
		this.listasService = listasService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AgendaOnlineApplication.class, args);
	}

}
