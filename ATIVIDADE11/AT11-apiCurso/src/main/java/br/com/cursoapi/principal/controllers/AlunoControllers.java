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

import br.com.cursoapi.principal.entities.Aluno;
import br.com.cursoapi.principal.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoControllers {

	@Autowired
	private AlunoService alunoService;

	@PostMapping
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoService.saveAluno(aluno);
	}

	@GetMapping
	public List<Aluno> getAllAluno() {
		return alunoService.getAllAluno();
	}

	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable Long id_aluno) {
		return alunoService.getAlunoById(id_aluno);
	}

	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable Long id_aluno) {
		alunoService.deleteAluno(id_aluno);
	}

}
