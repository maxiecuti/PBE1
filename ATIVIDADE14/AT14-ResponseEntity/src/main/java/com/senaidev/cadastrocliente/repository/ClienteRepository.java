package com.senaidev.cadastrocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastrocliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
