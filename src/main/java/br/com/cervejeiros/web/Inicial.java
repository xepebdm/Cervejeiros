package br.com.cervejeiros.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cervejeiros.model.dao.ForumLancesDao;

@Controller
public class Inicial {

	/**
	 * 
	 */
	
	@Autowired
	private ForumLancesDao forumLancesDao;
	
	@RequestMapping("/")
	private ModelAndView index() { 
		
		ModelAndView modelAndView = new ModelAndView("inicial");
		modelAndView.addObject("lista", forumLancesDao.getLances());
		
		return modelAndView;
		
	
	}
	
//	@RequestMapping("/")
//	public String index() {
//		System.out.println("Entrando na home no casa de código");
//		return "inicial";
//	}
	
}
