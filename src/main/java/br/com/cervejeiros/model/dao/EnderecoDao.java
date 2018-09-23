package br.com.cervejeiros.model.dao;

import javax.persistence.EntityManager;

import br.com.cervejeiros.model.bean.EnderecoBean;

/**
 * Classe de persistencia do endereco da pessoa
 * 
 * @author Alexsandre Rodrigues
 *
 */

public class EnderecoDao {
	private EntityManager em;

	public EnderecoDao(EntityManager em) {
		this.em = em;
	}

	public void adiciona(EnderecoBean endereco) {
		em.persist(endereco);
	}

	public void atualiza(EnderecoBean endereco) {
		em.merge(endereco);
	}
}
