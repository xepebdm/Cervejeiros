package br.com.cervejeiros.model.dao;

import javax.persistence.EntityManager;

import br.com.cervejeiros.model.bean.PessoaBean;

/**
 * Classe de persistencia do objeto Pessoa no banco de dados
 * 
 * @author Alexsandre Rodrigues
 *
 */

public class PessoaDao {
	private EntityManager em;

	public PessoaDao(EntityManager em) {
		this.em = em;
	}

	public void adiciona(PessoaBean pessoa) {
		em.persist(pessoa);
	}

	public void atualiza(PessoaBean pessoa) {
		em.merge(pessoa);
	}

}
