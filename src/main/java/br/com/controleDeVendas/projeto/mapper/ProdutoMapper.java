package br.com.controleDeVendas.projeto.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.controleDeVendas.projeto.dto.ProdutoDTO;
import br.com.controleDeVendas.projeto.model.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
	
		@Mapping(target = "id", source = "dto.idProduto")
		public Produto toEntity(ProdutoDTO dto);
	    
		@Mapping(target = "idProduto", source = "entidade.id")
		public ProdutoDTO toDto(Produto entidade);
		
		public List<Produto> toEntity(List<ProdutoDTO> lista);
		
		public List<ProdutoDTO> toDto(List<Produto> lista);

}
