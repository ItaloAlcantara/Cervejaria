package com.italo.Cervejaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.italo.Cervejaria.model.Categoria;
import com.italo.Cervejaria.model.Cerveja;
import com.italo.Cervejaria.repository.CategoriaRepository;
import com.italo.Cervejaria.repository.CervejaRepository;

@Controller
public class CervejaController {
	
	private static final String CADASTRO_VIEW=("cerveja/cadastrar");
	
	@Autowired
	private CervejaRepository cervejaRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping("/cadastrocerveja")
	private ModelAndView inicio() {
		ModelAndView mv =new ModelAndView(CADASTRO_VIEW);
		Iterable<Categoria> categorias=categoriaRepository.findAll();
		mv.addObject("categorias",categorias);
		return mv;
	}
	
	@PostMapping("/cadastrarcerveja")
	public String cadastrar(Cerveja cerveja) {
		cervejaRepository.save(cerveja);
		return "redirect:cadastrocerveja";
	}
}
