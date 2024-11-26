package com.senaidev.bancolivrarias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivrarias.entities.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
	Cliente findByCpf(String cpf);
}
