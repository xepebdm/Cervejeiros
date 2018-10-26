package br.com.cervejeiros.model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe que representa a tabela FORUM_CERVEJAS
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "Forum_Cervejas")
public class ForumCervejasBean implements Forum{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String assunto;
	private String mensagem;
	private boolean cancelado;
	
	@ManyToOne
	private PessoaBean pessoa;
	
	@OneToMany(mappedBy="forum")
	private List<ForumCervejasMsgBean> forumMsg;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
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

	public List<ForumCervejasMsgBean> getForumMsg() {
		return forumMsg;
	}

	public void setForumMsg(List<ForumCervejasMsgBean> forumMsg) {
		this.forumMsg = forumMsg;
	}
	
	
}

