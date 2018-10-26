package br.com.cervejeiros.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.cervejeiros.model.bean.ForumLancesBean;
import br.com.cervejeiros.model.dao.ForumLancesDao;

public class TesteListaLance {

	public static void main(String[] args) {

		ForumLancesDao forumLance = new ForumLancesDao();
		List<ForumLancesBean> lancesBean = new ArrayList<ForumLancesBean>(forumLance.getLances());

		for(ForumLancesBean lance : lancesBean) {
			System.out.println("Assunto: " + lance.getAssunto());
			System.out.println("Criador: " + lance.getPessoa().getNome());
			System.out.println("Mensagem: " + lance.getMensagem());
			System.out.println("Data: " + lance.getData());
			System.out.println("Tipo: " + lance.getTipo());
		}
	}

}
