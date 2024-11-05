package br.com.cursoapi.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoapi.principal.entities.Instrutor;
import br.com.cursoapi.principal.repository.InstrutorRepository;

@Service
public class InstrutorService {
	
	@Autowired
    private InstrutorRepository instrutorRepository;
    
    public List<Instrutor> getAllInstrutor() {
        return instrutorRepository.findAll();
    }

	public Instrutor saveInstrutor(Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
	}

	public Instrutor getInstrutorById(Long id_instrutor) {
		return instrutorRepository.findById(id_instrutor).orElse(null);
	}

	public void deleteInstrutor(Long id_instrutor) {
		instrutorRepository.deleteById(id_instrutor);
	}


}
