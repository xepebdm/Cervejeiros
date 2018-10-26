package br.com.cervejeiros.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cervejeiros.model.bean.ForumLancesBean;
import br.com.cervejeiros.model.bean.PessoaBean;
import br.com.cervejeiros.model.dao.ForumLancesDao;
import br.com.cervejeiros.model.dao.JPAUtil;

public class ForumLancesAction extends HttpServlet{

	/**
	 * Classe que realiza as principais operaçoes como criação, listagem e edição dos Lances do usuário
	 * 
	 * @author Alexsandre Rodrigues
	 * @version 1.0
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private EntityManager em = new JPAUtil().getConexao();
	private ForumLancesDao forumDao = new ForumLancesDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PessoaBean pessoa = (PessoaBean) req.getAttribute("pessoa");
		ForumLancesBean forumLances = (ForumLancesBean) req.getAttribute("forum");
		
		try {
			em.getTransaction().begin();
			forumDao.adiciona(forumLances);
			em.getTransaction().commit();
			em.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
