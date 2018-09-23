package br.com.cervejeiros.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a tabela CAD_ENDERECO
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "CAD_ENDERECO")
public class EnderecoBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "NUMERO")
	private int numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "CIDADE")
	private String cidade;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "PESSOA_ID")
	private int pessoaId;
}
