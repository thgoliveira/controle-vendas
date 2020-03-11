package br.com.controleDeVendas.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.controleDeVendas.projeto.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	@Query(value = "SELECT * FROM DB_CLIENTE cli WHERE cli.id = :id",
			   nativeQuery = true)
	Cliente buscarPorId(@Param("id") Long id);

}
