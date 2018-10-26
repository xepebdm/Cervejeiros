package br.com.cervejeiros.model.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.cervejeiros.model.bean.ForumEventosBean;

/**
 * Classe de persistencia do Forum_Eventos
 * @author Alexsandre Rodrigues
 *
 */
public class ForumEventosDao {

	private Query query;
	private List<ForumEventosBean> listaEventos;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cervejeiros");
	private EntityManager em = emf.createEntityManager();
	
	
	public void adiciona(ForumEventosBean forum) {
		em.persist(forum);
	}
	
	public void atualiza(ForumEventosBean forum) {
		em.merge(forum);
	}

	public List<ForumEventosBean> lista() {
		String consultaLista = "select * from FORUM_EVENTOS WHERE FORUM_EVENTOS.CANCELADO = 0";
		try {
			query = em.createQuery(consultaLista);
			query.setMaxResults(5);
			listaEventos = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.unmodifiableList(listaEventos);
	}
}
