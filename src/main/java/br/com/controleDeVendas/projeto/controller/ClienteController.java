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

import br.com.controleDeVendas.projeto.dto.ClienteDTO;
import br.com.controleDeVendas.projeto.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Controlador de Cliente")
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@ApiOperation(value = "API para consultar todos os clientes")
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> getTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@ApiOperation(value = "API para inserir cliente")
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ResponseEntity<ClienteDTO> incluir(@RequestBody ClienteDTO clienteDTO){
		return ResponseEntity.ok(service.inserir(clienteDTO));
	}
	
	@ApiOperation(value = "API para buscar cliente por id")
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable Long id){
		return ResponseEntity.ok(service.buscarPorId(id));
	}

}
