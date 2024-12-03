package com.senaidev.brechoDoGato.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_roupa")
public class Roupa {
	
	//atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_roupa;
	
	@Column(name = "cor", nullable = false, length = 100)
	private String cor;
	
	@Column(name = "categoria", nullable = false, length = 100)
	private String categoria;

	@Column(name = "tamanho", nullable = false, length = 100)
	private String tamanho;
	
	@Column(name = "estoque", nullable = false, length = 100)
	private int estoque;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;
	
	//construtores
	
	public Roupa() {
		
	}
	
	public Roupa(Long id_roupa, String cor, String categoria, String tamanho, int estoque) {
		this.id_roupa = id_roupa;
		this.cor = cor;
		this.categoria = categoria;
		this.tamanho = tamanho;
		this.estoque = estoque;
	}
	
	//getters e setters
	
	public Long getId_roupa() {
		return id_roupa;
	}

	public void setId_roupa(Long id_roupa) {
		this.id_roupa = id_roupa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
