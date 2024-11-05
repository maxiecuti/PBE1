package br.com.cursoapi.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoapi.principal.entities.Aluno;
import br.com.cursoapi.principal.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
    private AlunoRepository alunoRepository;
    
    public List<Aluno> getAllAluno() {
        return alunoRepository.findAll();
    }

	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public Aluno getAlunoById(Long id_aluno) {
		return alunoRepository.findById(id_aluno).orElse(null);
	}

	public void deleteAluno(Long id_aluno) {
		alunoRepository.deleteById(id_aluno);
	}


}
