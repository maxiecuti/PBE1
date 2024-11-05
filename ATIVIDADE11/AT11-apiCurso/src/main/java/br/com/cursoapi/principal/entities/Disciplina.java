package br.com.cursoapi.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina {

	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_disciplina;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "carga_horaria")
	private double carga_horaria;
	
	//Construtores
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, String descricao, double carga_horaria) {
		this.nome = nome;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
	}

	//Getters e Setters
	
	public Long getId_disciplina() {
		return id_disciplina;
	}

	public void setId_disciplina(Long id_disciplina) {
		this.id_disciplina = id_disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
}
