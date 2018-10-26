package br.com.cervejeiros.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cervejeiros.model.bean.ForumLancesBean;

/**
 * Classe de persistencia do Forum_Lances
 * 
 * @author Alexsandre Rodrigues
 *
 */

@Repository
@Transactional
public class ForumLancesDao {

	@PersistenceContext
	private EntityManager em;

	public void adiciona(ForumLancesBean forum) {
		em.persist(forum);
	}

	public void atualiza(ForumLancesBean forum, int id) {
		ForumLancesBean otherForum = forum;
		otherForum.setId(id);
		em.persist(otherForum);
	}

	public List<ForumLancesBean> getLances() {
		return em.createQuery("select f from ForumLances f", ForumLancesBean.class).getResultList();
	}
}
