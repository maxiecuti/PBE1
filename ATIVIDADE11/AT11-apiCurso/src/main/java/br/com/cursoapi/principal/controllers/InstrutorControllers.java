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

import br.com.cursoapi.principal.entities.Instrutor;
import br.com.cursoapi.principal.service.InstrutorService;

@RestController
@RequestMapping("/instrutor")
public class InstrutorControllers {

	@Autowired
	private InstrutorService instrutorService;

	@PostMapping
	public Instrutor createInstrutor(@RequestBody Instrutor instrutor) {
		return instrutorService.saveInstrutor(instrutor);
	}

	@GetMapping
	public List<Instrutor> getAllInstrutor() {
		return instrutorService.getAllInstrutor();
	}

	@GetMapping("/{id}")
	public Instrutor getInstrutor(@PathVariable Long id_instrutor) {
		return instrutorService.getInstrutorById(id_instrutor);
	}

	@DeleteMapping("/{id}")
	public void deleteInstrutor(@PathVariable Long id_instrutor) {
		instrutorService.deleteInstrutor(id_instrutor);
	}

}
