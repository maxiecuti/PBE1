package com.senaidev.bancolivrarias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivrarias.entities.Livro;

@Repository
public interface LivroRepository  extends JpaRepository<Livro, Long>{
	Livro findByIsbn(String isbn);
}
