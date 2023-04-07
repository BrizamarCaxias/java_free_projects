package br.com.alura.forum.controller;
import br.com.alura.forum.dto.TopicoDTO;
import br.com.alura.forum.modelo.*;
import br.com.alura.forum.repository.TopicoRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {
	@Autowired
	private TopicoRepository topicoRepository;
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(String nomeCurso){
		
		List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
		return TopicoDTO.converte(topicos);
		
	}
	
	

}
