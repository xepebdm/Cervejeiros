package br.com.cervejeiros.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 * Classe que representa a tabela FORUM_CERVEJAS_MSG
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_CERVEJAS_MSG")
public class ForumCervejasMsgBean implements ForumMsg{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String texto;
	private boolean cancelado;
	
	@ManyToOne
	private PessoaBean pessoa;
	
	@ManyToOne
	private ForumCervejasBean forum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
	}

	public ForumCervejasBean getForum() {
		return forum;
	}

	public void setForum(ForumCervejasBean forum) {
		this.forum = forum;
	}
	
	
}
