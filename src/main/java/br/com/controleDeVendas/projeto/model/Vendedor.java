package br.com.controleDeVendas.projeto.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DB_VENDEDOR", schema = "projetovendas")
@Data
public class Vendedor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String nomeFantasia;
	private String razaoSocial;
	private String endereco;
	private Long numero;
	private String cidade;
	private String pais;
	private Long cnpj;
	private String email;
	private Long telefone;
	private Long celular;
	private Long celularAdc;
	private String detalhes;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID_EMPRESA")
	private Empresa empresa;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID_CLIENTE")
	private Cliente cliente;

}
