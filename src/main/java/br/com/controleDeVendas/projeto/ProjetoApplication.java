package br.com.controleDeVendas.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableAutoConfiguration
@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("br.com.controleDeVendas.projeto.controller"))
			.paths(PathSelectors.any())
			.build();
	}
	
	@Bean
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Controle de Vendas")
				.description("API para exposição de recursos do controle de vendas.")
				.version("0.0.0.1")
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.com/licenses/LICENSE-2.0")
				.build();
	}

}
