package br.com.cervejeiros.model.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a tabela FORUM_EVENTOS
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_EVENTOS")
public class ForumEventosBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "LOCAL")
	private String local;

	@Column(name = "DATA")
	private Date data;

	@Column(name = "VALOR")
	private double valor;

	@Column(name = "TEXTO")
	private String texto;

	@Column(name = "CRIADOR")
	private int criador;

	@Column(name = "CANCELADO")
	private boolean cancelado;
}
