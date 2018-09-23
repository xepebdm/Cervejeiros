package br.com.cervejeiros.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a tabela FORUM_LANCES_MSG
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_LANCES_MSG")
public class ForumLancesMsgBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "TEXTO")
	private String texto;
	
	@Column(name = "PESSOA")
	private int pessoa;
	
	@Column(name = "FORUM_LANCES_ID")
	private int forumLancesId;
	
	@Column(name = "CANCELADO")
	private boolean cancelado;

}
