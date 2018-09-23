package br.com.cervejeiros.model.dao;

import javax.persistence.EntityManager;

import br.com.cervejeiros.model.bean.ForumLancesMsgBean;

/**
 * Classe de persistencia do Forum_Lances_Msg
 * @author Alexsandre Rodrigues
 *
 */

public class ForumLancesMsgDao {

	private EntityManager em;

	public ForumLancesMsgDao(EntityManager em) {
		this.em = em;
	}

	public void adiciona(ForumLancesMsgBean forumMsg) {
		em.persist(forumMsg);
	}
	
	public void atualiza(ForumLancesMsgBean forumMsg) {
		em.merge(forumMsg);
	}
}
