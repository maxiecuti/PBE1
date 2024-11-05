package br.com.cursoapi.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoapi.principal.entities.Curso;
import br.com.cursoapi.principal.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
    private CursoRepository cursoRepository;
    
    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }

	public Curso saveCurso(Curso curso) {
		return cursoRepository.save(curso);
	}

	public Curso getCursoById(Long id_curso) {
		return cursoRepository.findById(id_curso).orElse(null);
	}

	public void deleteCurso(Long id_curso) {
		cursoRepository.deleteById(id_curso);
	}

}
