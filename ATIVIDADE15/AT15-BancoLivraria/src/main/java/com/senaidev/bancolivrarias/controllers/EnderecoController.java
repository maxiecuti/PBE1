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

import com.senaidev.bancolivrarias.entities.Endereco;
import com.senaidev.bancolivrarias.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> buscarEndereco() {
        return enderecoService.buscarEndereco();
    }
    @GetMapping("/id")
    public ResponseEntity<Object> buscarEnderecoPorId(@PathVariable Long id){
    	Endereco endereco = enderecoService.buscarEnderecoPorId(id);
    	
    	if(endereco != null) {
    		return ResponseEntity.ok(endereco);
    	} else {
    		return ResponseEntity.status(404).body("Endereco com ID" + id + "não foi encontrado");
    	}
    }
  
    @PostMapping
    public Endereco criarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.criarEndereco(endereco);
    }

    @DeleteMapping("/{id}")
    public void excluirEndereco(@PathVariable Long id) {
    	enderecoService.excluirEndereco(id);
    }
}
