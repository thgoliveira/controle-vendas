package br.com.controleDeVendas.projeto.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ClienteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Nome do Cliente.", example = "Thiago Oliveira")
	private String nome;
	
	@ApiModelProperty(value = "Nome Fantasia do Cliente.", example = "Expansão Modas")
	private String nomeFantasia;

	@ApiModelProperty(value = "Razão Social do Cliente.", example = "Expansão Modas ME")
	private String razaoSocial;
	
	@ApiModelProperty(value = "Endereço do Cliente.", example = "Rua Cairbar Schutel")
	private String endereco;
	
	@ApiModelProperty(value = "Número do endereço do Cliente.", example = "'573'")
	private Long numero;
	
	@ApiModelProperty(value = "Cidade do Cliente.", example = "Matão")
	private String cidade;
	
	@ApiModelProperty(value = "País Fantasia do Cliente.", example = "Brasil")
	private String pais;
	
	@ApiModelProperty(value = "CNPJ do Cliente.", example = "'000000000000000'")
	private Long cnpj;
	
	@ApiModelProperty(value = "E-mail do Cliente.", example = "contato@expansaomodas.com.br")
	private String email;
	
	@ApiModelProperty(value = "Telefone do Cliente.", example = "'16992369082'")
	private Long telefone;
	
	@ApiModelProperty(value = "Celular do Cliente.", example = "'16992369082'")
	private Long celular;
	
	@ApiModelProperty(value = "Celular adicional do Cliente.", example = "'16992369082'")
	private Long celularAdc;
	
	@ApiModelProperty(value = "Detalhes do Cliente.", example = "Cliente não recebe entregas em sua loja, enviar no endereço .....")
	private String detalhes;
	
	@ApiModelProperty(value = "Id's dos produtos a serem salvos.", example = "Item1, item2, item3")
	private Long idProduto;
	
}
