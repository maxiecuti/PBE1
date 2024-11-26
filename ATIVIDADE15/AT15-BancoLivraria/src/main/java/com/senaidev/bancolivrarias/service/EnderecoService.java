package com.senaidev.bancolivrarias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivrarias.entities.Endereco;
import com.senaidev.bancolivrarias.repository.EnderecoRepository;

@Service
public class EnderecoService {


	@Autowired
	private EnderecoRepository enderecoRepository;

	   // Listar todos os endereco
    public List<Endereco> buscarEndereco() {
        return enderecoRepository.findAll();
    }

    // Buscar endereco por ID
    public Endereco buscarEnderecoPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    // Salvar endereco
    public Endereco criarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    // Deletar endereco
    public void excluirEndereco(Long id) {
    	enderecoRepository.deleteById(id);
    }
}
