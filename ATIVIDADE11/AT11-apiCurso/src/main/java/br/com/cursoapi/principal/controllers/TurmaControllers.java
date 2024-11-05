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

import br.com.cursoapi.principal.entities.Turma;
import br.com.cursoapi.principal.service.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaControllers {
 
	@Autowired
	private TurmaService turmaService;

	@PostMapping
	public Turma createTurma(@RequestBody Turma turma) {
		return turmaService.saveTurma(turma);
	}

	@GetMapping
	public List<Turma> getAllTurma() {
		return turmaService.getAllTurma();
	}

	@GetMapping("/{id}")
	public Turma getLivro(@PathVariable Long id_turma) {
		return turmaService.getTurmaById(id_turma);
	}

	@DeleteMapping("/{id}")
	public void deleteTurma(@PathVariable Long id_turma) {
		turmaService.deleteTurma(id_turma);
	}

}
