package br.com.cursoapi.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoapi.principal.entities.Turma;
import br.com.cursoapi.principal.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
    private TurmaRepository turmaRepository;
    
    public List<Turma> getAllTurma() {
        return turmaRepository.findAll();
    }

	public Turma saveTurma(Turma turma) {
		return turmaRepository.save(turma);
	}

	public Turma getTurmaById(Long id_turma) {
		return turmaRepository.findById(id_turma).orElse(null);
	}

	public void deleteTurma(Long id_turma) {
		turmaRepository.deleteById(id_turma);
	}


}
