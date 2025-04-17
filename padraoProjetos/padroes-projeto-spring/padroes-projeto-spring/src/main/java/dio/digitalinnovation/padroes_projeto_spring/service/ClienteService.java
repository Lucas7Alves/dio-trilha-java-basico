package dio.digitalinnovation.padroes_projeto_spring.service;

import dio.digitalinnovation.padroes_projeto_spring.entities.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);

}
