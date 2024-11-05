package br.com.cursoapi.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_curso;
	
	@Column(name = "nome")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "carga_horaria")
	private double carga_horaria;
	
	@Column(name = "nivel_dificuldade")
	private int nivel_dificuldade;
	
	//Construtores
	
	public Curso() {
		
	}
	
	public Curso(Long id_curso, String titulo, String descricao, double carga_horaria, int nivel_dificuldade) {
		this.id_curso = id_curso;
		this.titulo = titulo;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
		this.nivel_dificuldade = nivel_dificuldade;
	}
	
	//Getters e Setters

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public int getNivel_dificuldade() {
		return nivel_dificuldade;
	}

	public void setNivel_dificuldade(int nivel_dificuldade) {
		this.nivel_dificuldade = nivel_dificuldade;
	}
	

}
