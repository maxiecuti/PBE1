package com.senaidev.bancolivrarias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivrarias.entities.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Long>{

}
