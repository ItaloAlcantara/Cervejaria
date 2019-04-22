package com.italo.Cervejaria.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.italo.Cervejaria.model.Cerveja;
import com.italo.Cervejaria.service.CervejaService;

@Controller
public class CervejaController {

	@Autowired
	private CervejaService cervejaService;
	
	
	@GetMapping("/cadastrocerveja")
	private ModelAndView inicio() {
		return cervejaService.inicio();
	}
	
	@PostMapping("/cadastrarcerveja")
	public String cadastrar(Cerveja cerveja) {
		return cervejaService.cadastrar(cerveja);
	}
	
	@GetMapping("/listarcerveja")
	private ModelAndView listar() {
		return cervejaService.listar();
	}
	
}
