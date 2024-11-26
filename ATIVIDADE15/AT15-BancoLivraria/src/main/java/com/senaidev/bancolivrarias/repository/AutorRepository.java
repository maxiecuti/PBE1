package com.senaidev.bancolivrarias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivrarias.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
