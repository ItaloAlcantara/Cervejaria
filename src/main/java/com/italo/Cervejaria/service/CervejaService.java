package com.italo.Cervejaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.italo.Cervejaria.model.Categoria;
import com.italo.Cervejaria.model.Cerveja;
import com.italo.Cervejaria.repository.CategoriaRepository;
import com.italo.Cervejaria.repository.CervejaRepository;

@Service
public class CervejaService {
	
private static final String CADASTRO_VIEW=("cerveja/cadastrar");
	
	@Autowired
	private CervejaRepository cervejaRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	
		
	public String cadastrar(Cerveja cerveja) {
		cervejaRepository.save(cerveja);
		return "redirect:cadastrocerveja";
	}
	
	public ModelAndView inicio() {
		ModelAndView mv =new ModelAndView(CADASTRO_VIEW);
		
		mv.addObject("categorias",listaCategorias());
		return mv;
	}
	
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		
		mv.addObject("cervejas",listaCervejas());
		mv.addObject("categorias",listaCategorias());
		return mv;
	}
	
	public Iterable<Categoria> listaCategorias() {
		Iterable<Categoria> categorias=categoriaRepository.findAll();
		return categorias;
	}
	public Iterable<Cerveja> listaCervejas() {
		Iterable<Cerveja> cervejas=cervejaRepository.findAll();
		return cervejas;
	}
	
}
