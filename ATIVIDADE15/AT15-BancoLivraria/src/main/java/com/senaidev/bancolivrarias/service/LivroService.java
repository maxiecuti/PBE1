package com.senaidev.bancolivrarias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivrarias.entities.Livro;
import com.senaidev.bancolivrarias.repository.LivroRepository;

@Service
public class LivroService {

	    @Autowired
	    private LivroRepository livroRepository;

	    // Listar todos os livro
	    public List<Livro> buscarLivro() {
	        return livroRepository.findAll();
	    }

	    // Buscar livro por ID
	    public Livro buscarLivroPorId(Long id) {
	        return livroRepository.findById(id).orElse(null);
	    }
	    
	    //Buscar livro por isbn
	    public Livro buscarLivroPorIsbn(String isbn) {
	    	return livroRepository.findByIsbn(isbn);
	    }

	    // Salvar livro
	    public Livro criarLivro(Livro livro) {
	        return livroRepository.save(livro);
	    }

	    // Deletar livro
	    public void excluirLivro(Long id) {
	    	livroRepository.deleteById(id);
	    }
}
