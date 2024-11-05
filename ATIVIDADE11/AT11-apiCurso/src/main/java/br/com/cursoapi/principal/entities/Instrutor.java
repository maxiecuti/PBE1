package br.com.cursoapi.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_instrutor")
public class Instrutor {

	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_instrutor;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "experiencia")
	private String experiencia;
	
	//Construtores
	
	public Instrutor() {
		
	}
	
	public Instrutor(String nome, String email, String telefone, String area, String experiencia) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.area = area;
		this.experiencia = experiencia;
	}
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public Long getId_instrutor() {
		return id_instrutor;
	}

	public void setId_instrutor(Long id_instrutor) {
		this.id_instrutor = id_instrutor;
	}
}
