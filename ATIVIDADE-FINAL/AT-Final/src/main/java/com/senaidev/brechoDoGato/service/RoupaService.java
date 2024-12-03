package com.senaidev.brechoDoGato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.brechoDoGato.entities.Roupa;
import com.senaidev.brechoDoGato.repository.RoupaRepository;

@Service
public class RoupaService {
	
	    @Autowired
	    private RoupaRepository roupaRepository;

	    // Listar todos os clientes
	    public List<Roupa> buscarRoupa() {
	        return roupaRepository.findAll();
	    }

	    // Buscar cliente por ID
	    public Roupa buscarRoupaPorId(Long id) {
	        return roupaRepository.findById(id).orElse(null);
	    }

	    // Salvar cliente
	    public Roupa criarRoupa(Roupa roupa) {
	        return roupaRepository.save(roupa);
	    }

	    // Deletar cliente
	    public void excluirRoupa(Long id) {
	    	roupaRepository.deleteById(id);
	    }

}
