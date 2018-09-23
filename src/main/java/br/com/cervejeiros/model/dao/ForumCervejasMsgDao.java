package br.com.cervejeiros.model.dao;

import javax.persistence.EntityManager;

import br.com.cervejeiros.model.bean.ForumCervejasMsgBean;

/**
 * Classe de persistencia da tabela Forum_Cervejas_Msg
 * @author Alexsandre Rodrigues
 *
 */
public class ForumCervejasMsgDao {
	
	private EntityManager em;

	public ForumCervejasMsgDao(EntityManager em) {
		this.em = em;
	}
	
	public void adiciona(ForumCervejasMsgBean forumMsg) {
		em.persist(forumMsg);
	}
	
	public void atualiza(ForumCervejasMsgBean forumMsg) {
		em.merge(forumMsg);
	}

}
