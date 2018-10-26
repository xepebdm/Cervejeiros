package br.com.cervejeiros.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	
	public EntityManager getConexao() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cervejeiros");
		return emf.createEntityManager();		
	}

}
