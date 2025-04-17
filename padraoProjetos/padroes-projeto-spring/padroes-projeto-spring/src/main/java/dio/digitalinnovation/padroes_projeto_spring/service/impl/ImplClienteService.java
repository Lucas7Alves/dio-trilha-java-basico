package dio.digitalinnovation.padroes_projeto_spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.digitalinnovation.padroes_projeto_spring.entities.Cliente;
import dio.digitalinnovation.padroes_projeto_spring.entities.Endereco;
import dio.digitalinnovation.padroes_projeto_spring.repositories.ClienteRepository;
import dio.digitalinnovation.padroes_projeto_spring.repositories.EnderecoRepository;
import dio.digitalinnovation.padroes_projeto_spring.service.ClienteService;
import dio.digitalinnovation.padroes_projeto_spring.service.ViaCepService;

@Service
public class ImplClienteService implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id).get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		if (clienteRepository.existsById(id)) {
			salvarClienteComCep(cliente);
		} 
		
		
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id); 
		
	}
	
	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}

}
