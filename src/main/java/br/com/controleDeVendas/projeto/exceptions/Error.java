package br.com.controleDeVendas.projeto.exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class Error {

	private static final long serialVersionUID = 5546918763859741707L;

	@ApiModelProperty(required = true, value = "O timestamp em que o erro ocorreu.")
	private String timestamp;

	@ApiModelProperty(example = "400.0", required = true, value = "O status HTTP. Deve ser o mesmo status retornado como resposta da requisição.")
	@Valid
	@DecimalMin("100")
	@DecimalMax("599")
	private Integer status;

	@ApiModelProperty(example = "Bad Request", required = true, value = "A descrição do status HTTP.")
	private String error;

	@ApiModelProperty(example = "Dados obrigatórios não preenchidos.", required = true, value = "Mensagem resumindo o erro.")
	private String message;

	private String method;

	@ApiModelProperty(required = true, value = "")
	private String path;

	private ErrorDetails errorDetails;

	public Error(HttpStatus httpStatus, String message, String path, ErrorDetails errorDetails) {
		super();
		this.status = httpStatus.value();
		this.error = httpStatus.name();
		this.timestamp = DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now());
		this.message = message;
		this.path = path;
		this.errorDetails = errorDetails;
	}

}
