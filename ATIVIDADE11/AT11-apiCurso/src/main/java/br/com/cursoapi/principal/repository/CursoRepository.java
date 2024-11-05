package br.com.cursoapi.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoapi.principal.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
