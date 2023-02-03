package br.com.agendaonline.service;

import org.springframework.stereotype.Service;

import br.com.agendaonline.repository.TarefasRepository;


@Service
public class TarefasService {

	private Boolean system = true;
	private final TarefasRepository tarefasRepository;
	
	public TarefasService(TarefasRepository tarefasRepository) {
		this.tarefasRepository = tarefasRepository;
	}
}
