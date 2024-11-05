package br.com.cursoapi.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoapi.principal.entities.Disciplina;
import br.com.cursoapi.principal.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
    private DisciplinaRepository disciplinaRepository;
    
    public List<Disciplina> getAllDisciplina() {
        return disciplinaRepository.findAll();
    }

	public Disciplina saveDisciplina(Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}

	public Disciplina getDisciplinaById(Long id_disciplina) {
		return disciplinaRepository.findById(id_disciplina).orElse(null);
	}

	public void deleteDisciplina(Long id_disciplina) {
		disciplinaRepository.deleteById(id_disciplina);
	}


}
