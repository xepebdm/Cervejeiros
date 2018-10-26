package br.com.cervejeiros.model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.cervejeiros.model.tipos.TipoPessoa;
/**
 * Classe que representa a tabela CAD_PESSOA
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "CAD_PESSOA")
public class PessoaBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String nome;
	private String telefone;
	private TipoPessoa tipo;
	private String foto;
	private int nota;
	private boolean cancelado;
	private String usuario;
	private String senha;
	private String email;
	
	@OneToOne
	private EnderecoBean endereco;

	@OneToMany(mappedBy = "pessoa")
	private List<ForumEventosBean> forumEventos;
	
	@OneToMany(mappedBy = "pessoa")
	private List<ForumCervejasBean> forumCervejas;
	
	@OneToMany(mappedBy = "pessoa_ID")
	private List<ForumLancesBean> forumLances;
	
	@OneToMany(mappedBy = "pessoa")
	private List<ForumEventosMsgBean> forumEventosMsg;
	
	@OneToMany(mappedBy = "pessoa")
	private List<ForumCervejasMsgBean> forumCervejasMsg;
	
	@OneToMany(mappedBy = "pessoa")
	private List<ForumLancesMsgBean> forumLancesMsg;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getID() {
		return ID;
	}

	public EnderecoBean getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoBean endereco) {
		this.endereco = endereco;
	}

	public List<ForumEventosBean> getForumEventos() {
		return forumEventos;
	}

	public void setForumEventos(List<ForumEventosBean> forumEventos) {
		this.forumEventos = forumEventos;
	}

	public List<ForumCervejasBean> getForumCervejas() {
		return forumCervejas;
	}

	public void setForumCervejas(List<ForumCervejasBean> forumCervejas) {
		this.forumCervejas = forumCervejas;
	}

	public List<ForumLancesBean> getForumLances() {
		return forumLances;
	}

	public void setForumLances(List<ForumLancesBean> forumLances) {
		this.forumLances = forumLances;
	}

	public void setID(int iD) {
		ID = iD;
	}

	
}
