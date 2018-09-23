package br.com.cervejeiros.model.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.cervejeiros.model.bean.ForumCervejasBean;

/**
 * Classe de persistencia do Forum_Cervejas
 * 
 * @author Alexsandre Rodrigues
 *
 */

public class ForumCervejasDao {
	private List<ForumCervejasBean> forumCervejas;
	private EntityManager em;
	private Query query;

	public ForumCervejasDao(EntityManager em) {
		this.em = em;
	}

	public void adiciona(ForumCervejasBean forum) {
		em.persist(forum);
	}

	public void atualiza(ForumCervejasBean forum) {
		em.merge(forum);
	}

	public List<ForumCervejasBean> lista() {
		String consulta = "select * from FORUM_CERVEJAS where forum_cervejas.cancelado = 0";
		query = em.createQuery(consulta);
		try {
			forumCervejas = query.getResultList();
			query.setMaxResults(5);
		} catch (NoResultException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.unmodifiableList(forumCervejas);
	}

}
