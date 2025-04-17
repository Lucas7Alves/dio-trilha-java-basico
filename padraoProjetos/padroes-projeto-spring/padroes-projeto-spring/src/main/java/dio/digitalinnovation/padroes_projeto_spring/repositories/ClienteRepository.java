package dio.digitalinnovation.padroes_projeto_spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.digitalinnovation.padroes_projeto_spring.entities.Cliente;

@Repository	
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
