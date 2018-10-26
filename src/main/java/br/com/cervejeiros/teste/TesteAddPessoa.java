package br.com.cervejeiros.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cervejeiros.model.bean.PessoaBean;
import br.com.cervejeiros.model.dao.PessoaDao;
import br.com.cervejeiros.model.tipos.TipoPessoa;

public class TesteAddPessoa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cervejeiros");
		EntityManager em = emf.createEntityManager();
		PessoaBean pessoa = new PessoaBean();
		
		pessoa.setNome("Teste 1");
		pessoa.setSenha("teste123");
		pessoa.setCancelado(false);
		pessoa.setEmail("teste@teste.com");
		pessoa.setNota(5);
		pessoa.setTelefone("21-2121-2121");
		pessoa.setTipo(TipoPessoa.PESSOA);
		pessoa.setUsuario("teste");
		
		em.getTransaction().begin();
		
		PessoaDao pessoaDao = new PessoaDao(em);
		pessoaDao.adiciona(pessoa);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
