package br.com.cervejeiros.model.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe que representa a tabela FORUM_EVENTOS
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_EVENTOS")
public class ForumEventosBean implements Forum{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String local;
	private BigDecimal valor;
	private String texto;
	private boolean cancelado;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne
	private PessoaBean pessoa;
	
	@OneToMany(mappedBy = "forum")
	private List<ForumEventosMsgBean> forumMsg;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
	}

	public List<ForumEventosMsgBean> getForumMsg() {
		return forumMsg;
	}

	public void setForumMsg(List<ForumEventosMsgBean> forumMsg) {
		this.forumMsg = forumMsg;
	}
	
	

}
