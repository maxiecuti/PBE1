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

import br.com.cursoapi.principal.entities.Curso;
import br.com.cursoapi.principal.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoControllers {

	@Autowired
	private CursoService cursoService;

	@PostMapping
	public Curso createCurso(@RequestBody Curso curso) {
		return cursoService.saveCurso(curso);
	}

	@GetMapping
	public List<Curso> getAllCurso() {
		return cursoService.getAllCurso();
	}

	@GetMapping("/{id}")
	public Curso getCurso(@PathVariable Long id_curso) {
		return cursoService.getCursoById(id_curso);
	}

	@DeleteMapping("/{id}")
	public void deleteCurso(@PathVariable Long id_curso) {
		cursoService.deleteCurso(id_curso);
	}

}
