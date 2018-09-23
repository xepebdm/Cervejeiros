package br.com.cervejeiros.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.cervejeiros.model.tipos.TipoLance;

/**
 * Classe que representa a tabela FORUM_LANCES
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_LANCES")
public class ForumLancesBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "ASSUNTO")
	private String assunto;
	
	@Column(name = "MENSAGEM")
	private String mensagem;
	
	@Column(name="CRIADOR")
	private int criador;
	
	@Column(name="CANCELADO")
	private boolean cancelado;
	
	@Column(name = "TIPO")
	private TipoLance tipo;

}
