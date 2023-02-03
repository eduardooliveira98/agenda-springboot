package br.com.agendaonline.service;



import org.springframework.stereotype.Service;

import br.com.agendaonline.repository.ListasRepository;

@Service
public class ListasService {

	private Boolean system = true;
	private final ListasRepository listasRepository;
	
	public ListasService(ListasRepository listasRepository) {
		this.listasRepository = listasRepository;
	}
}
