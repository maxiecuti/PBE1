package com.senaidev.bancolivrarias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancolivrarias.entities.Livro;
import com.senaidev.bancolivrarias.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> buscarLivro() {
        return livroService.buscarLivro();
    }
    @GetMapping("/id")
    public ResponseEntity<Object> buscarLivroPorId(@PathVariable Long id){
    	Livro livro = livroService.buscarLivroPorId(id);
    	
    	if(livro != null) {
    		return ResponseEntity.ok(livro);
    	} else {
    		return ResponseEntity.status(404).body("Livro com ID" + id + "não foi encontrado");
    	}
    }
    
    @GetMapping("/isbn/{isbn}")
    public Livro buscarLivroPorIsbn(@PathVariable String isbn) {
    	return livroService.buscarLivroPorIsbn(isbn);
    }

    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro) {
        return livroService.criarLivro(livro);
    }

    @DeleteMapping("/{id}")
    public void excluirLivro(@PathVariable Long id) {
    	livroService.excluirLivro(id);
    }
}
