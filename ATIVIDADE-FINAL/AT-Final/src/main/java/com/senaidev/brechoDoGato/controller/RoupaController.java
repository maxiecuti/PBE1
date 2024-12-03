package com.senaidev.brechoDoGato.controller;

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

import com.senaidev.brechoDoGato.entities.Roupa;
import com.senaidev.brechoDoGato.service.RoupaService;

@RestController
@RequestMapping("/roupas")
public class RoupaController {

	 @Autowired
	    private RoupaService roupaService;

	    @GetMapping
	    public List<Roupa> buscarRoupa() {
	        return roupaService.buscarRoupa();
	    }
	    @GetMapping("/id")
	    public ResponseEntity<Object> buscarRoupaPorId(@PathVariable Long id){
	    	Roupa roupa = roupaService.buscarRoupaPorId(id);
	    	
	    	if(roupa != null) {
	    		return ResponseEntity.ok(roupa);
	    	} else {
	    		return ResponseEntity.status(404).body("Cliente com ID" + id + "não foi encontrado");
	    	}
	    }
	    
	    @PostMapping
	    public Roupa criarRoupa(@RequestBody Roupa roupa) {
	        return roupaService.criarRoupa(roupa);
	    }

	    @DeleteMapping("/{id}")
	    public void excluirRoupa(@PathVariable Long id) {
	    	roupaService.excluirRoupa(id);
	    }
}
