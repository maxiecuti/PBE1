package com.senaidev.bancolivrarias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancolivrarias.entities.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
