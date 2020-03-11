package br.com.controleDeVendas.projeto.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.controleDeVendas.projeto.dto.ClienteDTO;
import br.com.controleDeVendas.projeto.dto.ProdutoDTO;
import br.com.controleDeVendas.projeto.model.Cliente;
import br.com.controleDeVendas.projeto.model.Produto;

@Mapper(componentModel = "spring", uses = {Produto.class, ProdutoDTO.class})
public interface ClienteMapper {
	
	public Cliente toEntity(ClienteDTO dto);
	
	@Mapping(target = "idProduto", source = "entity.produto.id")
	public ClienteDTO toDto(Cliente entity);	
	
	public List<Cliente> toEntity(List<ClienteDTO> lista);

	public List<ClienteDTO> toDto(List<Cliente> lista);

}
