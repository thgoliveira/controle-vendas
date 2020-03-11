package br.com.controleDeVendas.projeto.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProdutoDTO {

	@ApiModelProperty(value = "Id do Produto.", example = "'1'")
	private Long idProduto;
	
	@ApiModelProperty(value = "Nome do Produto.", example = "Coca-cola")
	private String nome;
	
	@ApiModelProperty(value = "Código do Produto.", example = "'123456'")
	private Long codigo;
	
	@ApiModelProperty(value = "Cor do Produto.", example = "Verde")
	private String cor;
	
	@ApiModelProperty(value = "Tamanho do Produto.", example = "M")
	private String tamanho;

}
