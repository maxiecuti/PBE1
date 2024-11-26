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

import com.senaidev.bancolivrarias.entities.Autor;
import com.senaidev.bancolivrarias.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {

	@Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> buscarAutor() {
        return autorService.buscarAutor();
    }
    @GetMapping("/id")
    public ResponseEntity<Object> buscarAutorPorId(@PathVariable Long id){
    	Autor autor = autorService.buscarAutorPorId(id);
    	
    	if(autor != null) {
    		return ResponseEntity.ok(autor);
    	} else {
    		return ResponseEntity.status(404).body("Autor com ID" + id + "não foi encontrado");
    	}
    }
  
    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return autorService.criarAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void excluirAutor(@PathVariable Long id) {
    	autorService.excluirAutor(id);
    }
}
