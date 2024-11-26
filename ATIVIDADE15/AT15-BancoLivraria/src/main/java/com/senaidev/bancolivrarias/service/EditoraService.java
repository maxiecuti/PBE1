package com.senaidev.bancolivrarias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivrarias.entities.Editora;
import com.senaidev.bancolivrarias.repository.EditoraRepository;

@Service
public class EditoraService {

	  @Autowired
	    private EditoraRepository editoraRepository;

	    // Listar todos os editora
	    public List<Editora> buscarEditora() {
	        return editoraRepository.findAll();
	    }

	    // Buscar editora por ID
	    public Editora buscarEditoraPorId(Long id) {
	        return editoraRepository.findById(id).orElse(null);
	    }
	    
	    //Buscar editora por cnpj
	    public Editora buscarEditoraPorCnpj(String cpf) {
	    	return editoraRepository.findByCnpj(cpf);
	    }

	    // Salvar editora
	    public Editora criarEditora(Editora editora) {
	        return editoraRepository.save(editora);
	    }

	    // Deletar editora
	    public void excluirEditora(Long id) {
	    	editoraRepository.deleteById(id);
	    }
}
