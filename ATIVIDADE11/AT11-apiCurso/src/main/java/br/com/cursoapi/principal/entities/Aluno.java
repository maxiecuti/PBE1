package br.com.cursoapi.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_aluno;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "matricula")
	private String matricula;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "inicio_curso")
	private int inicio_curso;
	
	@Column(name = "conclusao")
	private int conclusao;
	
	//Construtores
	
	public Aluno() {
		
	}
	
	public Aluno(Long id_aluno, String nome, String matricula, String email, String telefone, int inicio_curso, int conclusao) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.telefone = telefone;
		this.inicio_curso = inicio_curso;
		this.conclusao = conclusao;
	}
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getInicio_curso() {
		return inicio_curso;
	}

	public void setInicio_curso(int inicio_curso) {
		this.inicio_curso = inicio_curso;
	}

	public int getConclusao() {
		return conclusao;
	}

	public void setConclusao(int conclusao) {
		this.conclusao = conclusao;
	}

	public Long getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}
}
