package br.com.controleDeVendas.projeto.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controleDeVendas.projeto.dto.ClienteDTO;
import br.com.controleDeVendas.projeto.exceptions.NotFoundException;
import br.com.controleDeVendas.projeto.mapper.ClienteMapper;
import br.com.controleDeVendas.projeto.mapper.ProdutoMapper;
import br.com.controleDeVendas.projeto.model.Cliente;
import br.com.controleDeVendas.projeto.model.Produto;
import br.com.controleDeVendas.projeto.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteMapper cliMapper;
	
	@Autowired
	private ProdutoMapper prodMapper;
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private ProdutoService prodService;
	
	public List<ClienteDTO> buscarTodos(){
		List<Cliente> lista = repository.findAll();
		
		if(lista.isEmpty()) {
			throw new NotFoundException("Nenhum registro encontrado!");
		} 
		
		return cliMapper.toDto(lista);
		
	}

	@Transactional
	public ClienteDTO inserir(ClienteDTO clienteDTO) {
		
		if(Objects.isNull(clienteDTO)) {
			throw new NotFoundException("Nenhum registro encontrado!");
		}
		Long idProduto = clienteDTO.getIdProduto();
		Produto produto = prodMapper.toEntity(prodService.buscarPorId(idProduto));
		Cliente cliente = cliMapper.toEntity(clienteDTO);
		cliente.setProduto(produto);
		repository.save(cliente);
		return cliMapper.toDto(cliente);
	}
	
	public ClienteDTO buscarPorId(Long id) {
		Cliente entidade = repository.buscarPorId(id);	
		if(Objects.isNull(entidade)) { 
			 throw new NotFoundException("Nenhum cliente informado!"); 
		 }
		
		return cliMapper.toDto(entidade);
	}

}
