package com.italo.Cervejaria.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.italo.Cervejaria.model.Categoria;
import com.italo.Cervejaria.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
private static final String CADASTRO_VIEW=("categoria/cadastrar");
	
	@Autowired
	private CategoriaRepository categoriaRepository;
		
	public ModelAndView inicio() {
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		return mv;
	}
	
	public String cadastrar(Categoria categoria) {
		categoriaRepository.save(categoria);
		return "redirect:cadastrocategoria";
	}
	
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		Iterable<Categoria> categoria = categoriaRepository.findAll();
		mv.addObject("categorias",categoria);
		return mv;
	}
	
}
