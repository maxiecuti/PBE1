package br.com.cursoapi.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_turma")
public class Turma {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_turma;
	
	@Column(name = "inicio")
	private int inicio;
	
	@Column(name = "termino")
	private int termino;
	
	@Column(name = "carga_horaria")
	private int horario_aulas;

	@Column(name = "numero_vagas")
	private int numero_vagas;
	
	//Construtores
	
	public Turma() {
		
	}
	
	public Turma(int inicio, int termino, int horario_aulas, int numero_vagas) {
		this.inicio = inicio;
		this.termino = termino;
		this.horario_aulas = horario_aulas;
		this.numero_vagas = numero_vagas;
	}
	
	//Getters e Setters

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getTermino() {
		return termino;
	}

	public void setTermino(int termino) {
		this.termino = termino;
	}

	public int getHorario_aulas() {
		return horario_aulas;
	}

	public void setHorario_aulas(int horario_aulas) {
		this.horario_aulas = horario_aulas;
	}

	public int getNumero_vagas() {
		return numero_vagas;
	}

	public void setNumero_vagas(int numero_vagas) {
		this.numero_vagas = numero_vagas;
	}

	public Long getId_turma() {
		return id_turma;
	}

	public void setId_turma(Long id_turma) {
		this.id_turma = id_turma;
	}
}
