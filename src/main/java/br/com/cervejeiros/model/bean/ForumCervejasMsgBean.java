package br.com.cervejeiros.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * Classe que representa a tabela FORUM_CERVEJAS_MSG
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_CERVEJAS_MSG")
public class ForumCervejasMsgBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "TEXTO")
	private String texto;
	
	@Column(name = "PESSOA")
	private int pessoa;
	
	@Column(name = "FORUM_CERVEJAS_ID")
	private int forumCervejasId;
	
	@Column(name = "CANCELADO")
	private boolean cancelado;
}
