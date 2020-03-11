package br.com.controleDeVendas.projeto.dto;

import java.io.Serializable;

import br.com.controleDeVendas.projeto.model.Empresa;
import lombok.Data;

@Data
public class VendedorDTO implements Serializable{
	
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
	private Long celular;
	private Long celularAdc;
	private String detalhes;
	private Empresa empresa;
	private Empresa cliente;

}
