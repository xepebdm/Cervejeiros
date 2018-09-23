package br.com.cervejeiros.model.dao;

import javax.persistence.EntityManager;

import br.com.cervejeiros.model.bean.ForumEventosMsgBean;

/**
 * Classe de persistencia do Forum_Eventos_Msg
 * @author Alexsandre Rodrigues
 *
 */
public class ForumEventosMsgDao {
	private EntityManager em;

	public ForumEventosMsgDao(EntityManager em) {
		this.em = em;
	}
	
	public void adiciona(ForumEventosMsgBean forumMSg) {
		em.persist(forumMSg);
	}
	
	public void atualiza(ForumEventosMsgBean forumMsg) {
		em.merge(forumMsg);
	}

}
