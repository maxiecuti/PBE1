package br.com.cursoapi.principal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursoapi.principal.entities.Disciplina;
import br.com.cursoapi.principal.service.DisciplinaService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaControllers {

	@Autowired
	private DisciplinaService disciplinaService;
	
	@PostMapping
	public Disciplina createDisciplina(@RequestBody Disciplina disciplina) {
		return disciplinaService.saveDisciplina(disciplina);
	}

	@GetMapping
	public List<Disciplina> getAllDIsciplina() {
		return disciplinaService.getAllDisciplina();
	}

	@GetMapping("/{id}")
	public Disciplina getDiscplina(@PathVariable Long id_disciplina) {
		return disciplinaService.getDisciplinaById(id_disciplina);
	}

	@DeleteMapping("/{id}")
	public void deleteDisciplina(@PathVariable Long id_disciplina) {
		disciplinaService.deleteDisciplina(id_disciplina);
	}

}
