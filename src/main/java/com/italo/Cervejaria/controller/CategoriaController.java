package com.italo.Cervejaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.italo.Cervejaria.model.Categoria;
import com.italo.Cervejaria.model.Tipo;
import com.italo.Cervejaria.repository.CategoriaRepository;

@Controller
public class CategoriaController {
	
	private static final String CADASTRO_VIEW=("categoria/cadastrar");
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping("/cadastrocategoria")
	public ModelAndView inicio() {
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject("tipoCategoria",Tipo.values());
		return mv;//Primeiro pasta depois pagina HTML
	}
	
	@PostMapping("/cadastrarcategoria")
	public String cadastrar(Categoria categoria) {
		categoriaRepository.save(categoria);
		return "redirect:cadastrocategoria";
	}
}
