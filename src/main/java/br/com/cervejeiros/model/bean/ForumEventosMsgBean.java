package br.com.cervejeiros.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a tabela FORUM_EVENTOS_MSG
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_EVENTOS_MSG")
public class ForumEventosMsgBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "TEXTO")
	private String texto;

	@Column(name = "PESSOA")
	private int pessoa;

	@Column(name = "FORUM_EVENTOS_ID")
	private int forumEventosId;

	@Column(name = "CANCELADO")
	private boolean cancelado;
}
