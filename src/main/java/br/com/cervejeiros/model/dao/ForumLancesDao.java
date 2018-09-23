package br.com.cervejeiros.model.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cervejeiros.model.bean.ForumLancesBean;

/**
 * Classe de persistencia do Forum_Lances
 * 
 * @author Alexsandre Rodrigues
 *
 */

public class ForumLancesDao {

	private EntityManager em;
	private List<ForumLancesBean> forumLista;
	private Query query;

	public ForumLancesDao(EntityManager em) {
		this.em = em;
	}

	public void adiciona(ForumLancesBean forum) {
		em.persist(forum);
	}

	public void atualiza(ForumLancesBean forum) {
		em.merge(forum);
	}

	public List<ForumLancesBean> lista() {
		String listaConsulta = "select * from FORUM_LANCES AS FORUM WHERE FORUM.CANCELADO = 0";
		query.setMaxResults(5);
		
		try {
			query = em.createQuery(listaConsulta);
			forumLista = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.unmodifiableList(forumLista);
	}
}
