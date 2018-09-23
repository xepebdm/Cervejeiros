package br.com.cervejeiros.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.cervejeiros.model.tipos.TipoPessoa;
/**
 * Classe que representa a tabela CAD_PESSOA
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "CAD_PESSOA")
public class PessoaBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "TELEFONE1")
	private String telefone;

	@Column(name = "TIPO")
	private TipoPessoa tipo;

	@Column(name = "FOTO")
	private Object foto;

	@Column(name = "NOTA")
	private int nota;

	@Column(name = "CANCELADO")
	private boolean cancelado;

	@Column(name = "USUARIO")
	private String usuario;

	@Column(name = "SENHA")
	private String senha;

	@Column(name = "EMAIL")
	private String email;

}
