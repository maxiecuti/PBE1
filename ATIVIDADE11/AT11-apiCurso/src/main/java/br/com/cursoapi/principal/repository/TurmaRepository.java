package br.com.cursoapi.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoapi.principal.entities.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
