package com.senaidev.bancolivrarias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancolivrarias.entities.Pedido;
import com.senaidev.bancolivrarias.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> buscarPedido() {
        return pedidoService.buscarPedido();
    }
    @GetMapping("/id")
    public ResponseEntity<Object> buscarPedidoPorId(@PathVariable Long id){
    	Pedido pedido = pedidoService.buscarPedidoPorId(id);
    	
    	if(pedido != null) {
    		return ResponseEntity.ok(pedido);
    	} else {
    		return ResponseEntity.status(404).body("Pedido com ID" + id + "não foi encontrado");
    	}
    }
  
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void excluirPedido(@PathVariable Long id) {
    	pedidoService.excluirPedido(id);
    }
}
