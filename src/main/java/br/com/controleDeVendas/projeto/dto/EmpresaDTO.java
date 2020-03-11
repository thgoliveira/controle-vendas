package br.com.controleDeVendas.projeto.dto;

import java.io.Serializable;

import br.com.controleDeVendas.projeto.model.Produto;
import br.com.controleDeVendas.projeto.model.Vendedor;
import lombok.Data;

@Data
public class EmpresaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	private Long telefoneAdc;
	private Long celular;
	private String detalhes;
	private Produto produto;
	private Vendedor vendedor;

}
