package br.com.cursoapi.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoapi.principal.entities.Instrutor;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long>{

}
