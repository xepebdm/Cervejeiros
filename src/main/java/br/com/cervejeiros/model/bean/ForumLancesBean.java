package br.com.cervejeiros.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.cervejeiros.model.tipos.TipoLance;

/**
 * Classe que representa a tabela FORUM_LANCES
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_LANCES")
public class ForumLancesBean implements Forum{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="assunto")
	private String assunto;
	
	@Column(name = "mensagem")
	private String mensagem;
	
	@Column(name = "cancelado")
	private int cancelado;
	
	@Column(name = "tipo")
	private TipoLance tipo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data")
	private Date data;

	@ManyToOne
	private PessoaBean pessoa_ID;
	
	@OneToMany(mappedBy = "forum")
	private List<ForumLancesMsgBean> forumMsg;

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

	public int isCancelado() {
		return cancelado;
	}

	public void setCancelado(int cancelado) {
		this.cancelado = cancelado;
	}

	public TipoLance getTipo() {
		return tipo;
	}

	public void setTipo(TipoLance tipo) {
		this.tipo = tipo;
	}

	public PessoaBean getPessoa() {
		return pessoa_ID;
	}

	public void setPessoa(PessoaBean pessoa) {
		this.pessoa_ID = pessoa;
	}

	public List<ForumLancesMsgBean> getForumMsg() {
		return forumMsg;
	}

	public void setForumMsg(List<ForumLancesMsgBean> forumMsg) {
		this.forumMsg = forumMsg;
	}
	
	
	// RETORNA UMA PREVIA DA MENSAGEM DO FORUM CRIADO PELO USUÁRIO
	public String getMensagemPrevia() {
		return mensagem.substring(30);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
