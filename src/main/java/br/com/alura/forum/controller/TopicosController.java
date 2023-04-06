package br.com.alura.forum.controller;
import br.com.alura.forum.dto.TopicoDTO;
import br.com.alura.forum.modelo.*;
import java.util.*;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		
		Topico topico = new Topico("Dúvida","Dúvida com Spring",new Curso("Spring","Programação"));
		return TopicoDTO.converte(Arrays.asList(topico,topico,topico,topico));
		
	}
	
	

}
