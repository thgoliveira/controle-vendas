package br.com.controleDeVendas.projeto.exceptions;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ErrorDetails {

	@ApiModelProperty(example = "e9ef6d22-7f46-426b-8121-417e1714ad6d", required = true, value = "Indentificador único do erro. Pode ser utilizado para rastrear a propagação do erro.")
	private String uniqueId;

	@ApiModelProperty(example = "error.business.request.invalid", required = true, value = "Código do erro.")
	private String informationCode;

	@ApiModelProperty(example = "O atributo {1} deve ser preenchido.", required = true, value = "Descrição do erro.")
	private String message;

	@ApiModelProperty(example = "[\"account_id\"]", value = "Dados complementares do erro.")
	private List<String> args;

	@ApiModelProperty
	private ErrorDetails nested;

}
