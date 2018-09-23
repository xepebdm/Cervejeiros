package br.com.cervejeiros.web;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cervejeiros.model.bean.ForumCervejasBean;
import br.com.cervejeiros.model.bean.ForumEventosBean;
import br.com.cervejeiros.model.bean.ForumLancesBean;
import br.com.cervejeiros.model.dao.ForumCervejasDao;
import br.com.cervejeiros.model.dao.ForumEventosDao;
import br.com.cervejeiros.model.dao.ForumLancesDao;

@WebServlet(urlPatterns = "/")
public class Inicial extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("forumCervejasBean");
		ForumCervejasDao forumCervejasDao = new ForumCervejasDao(em);
		ForumLancesDao forumLancesDao = new ForumLancesDao(em);
		ForumEventosDao forumEventosDao = new ForumEventosDao(em);
		
		List<ForumEventosBean> listaEventos = forumEventosDao.lista();
		List<ForumCervejasBean> listaCervejas = forumCervejasDao.lista();
		List<ForumLancesBean> listaLances = forumLancesDao.lista();
		
		req.setAttribute("listaEventos", listaEventos);
		req.setAttribute("listaCervejas", listaCervejas);
		req.setAttribute("listaLances", listaLances);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/inicial.jsp");
		dispatcher.forward(req, resp);
	
	}
	
}
