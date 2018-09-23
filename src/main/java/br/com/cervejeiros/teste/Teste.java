package br.com.cervejeiros.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {

		EntityManager conexao = (EntityManager) Persistence.createEntityManagerFactory("lacerveja");
		
		conexao.close();
	}

}
