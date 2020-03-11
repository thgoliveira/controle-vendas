package br.com.controleDeVendas.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.controleDeVendas.projeto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	@Query(value = "SELECT * FROM DB_PRODUTO prod WHERE prod.id = :id",
		   nativeQuery = true)
	Produto buscaPorId(@Param("id") Long id);

}
