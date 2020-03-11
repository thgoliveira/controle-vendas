package br.com.controleDeVendas.projeto.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controleDeVendas.projeto.dto.ProdutoDTO;
import br.com.controleDeVendas.projeto.exceptions.NotFoundException;
import br.com.controleDeVendas.projeto.mapper.ProdutoMapper;
import br.com.controleDeVendas.projeto.model.Produto;
import br.com.controleDeVendas.projeto.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoMapper mapper;
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<ProdutoDTO> buscarTodos() {
		List<Produto> lista = repository.findAll();
		
		if(lista.isEmpty()) {
			throw new NotFoundException("Nenhum Produto encontrado!");
		}
		List<ProdutoDTO> dto = mapper.toDto(lista);
		return dto;
		
	}
	
	@Transactional
	public ProdutoDTO inserir(ProdutoDTO dto) {
		if(Objects.isNull(dto)) {
			throw new NotFoundException("Nenhum registro encontrado!");
		}
		
		return mapper.toDto(repository.save(mapper.toEntity(dto)));
	}

	
	 public ProdutoDTO buscarPorId(Long id) { 
		 Produto entidade = repository.buscaPorId(id); 
		 if(Objects.isNull(entidade)) { 
			 throw new NotFoundException("Nenhum produto informado!"); 
		 }
		 
		 return mapper.toDto(entidade);
	 }

}
