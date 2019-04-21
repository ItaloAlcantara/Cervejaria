package com.italo.Cervejaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.italo.Cervejaria.model.Categoria;
import com.italo.Cervejaria.service.CategoriaService;

@Controller
public class CategoriaController {
		
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/cadastrocategoria")
	public ModelAndView inicio() {
		return categoriaService.inicio();
	}
	
	@PostMapping("/cadastrarcategoria")
	public String cadastrar(Categoria categoria) {
		return categoriaService.cadastrar(categoria);
	}
	
	@GetMapping("/listarcategoria")
	public ModelAndView listar() {
		return categoriaService.listar();
	}
}
