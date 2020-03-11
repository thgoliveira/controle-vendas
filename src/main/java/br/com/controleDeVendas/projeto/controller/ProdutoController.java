package br.com.controleDeVendas.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.controleDeVendas.projeto.dto.ProdutoDTO;
import br.com.controleDeVendas.projeto.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Controlador de Produto")
@RestController()
@RequestMapping(value = "/produto", produces="application/json")
public class ProdutoController {
	
	@Autowired
	public ProdutoService service;
	
	@ApiOperation(value = "API para consultar todos os produtos")
	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> getTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@ApiOperation(value = "API para inserir um produto")
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ResponseEntity<ProdutoDTO> inserir(@RequestBody ProdutoDTO dto){
		return ResponseEntity.ok(service.inserir(dto));
	}
	
	
	@ApiOperation(value = "API para inserir um produto")
	@PostMapping(value = "/{id}") 
	public ResponseEntity<ProdutoDTO> buscarPorId(@PathVariable Long id){ 
		return ResponseEntity.ok(service.buscarPorId(id)); 
	}

}
