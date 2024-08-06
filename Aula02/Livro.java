package prjCaneta;

public class Livro {
	
	String livro;
	String autor;
	boolean aluguel;
	
	public Livro (String livro, String autor) {
		this.livro = livro;
		this.autor = autor;
		this.aluguel = false;
		
	}
	
	void status() {
		System.out.println("Livro: " + this.livro);
		System.out.println("Autor: " + this.autor);
	}
	void aluguel() {
		System.out.println(this.livro + ":" + (this.aluguel ? "Alugado":"Disponível"));
	}
	void alugar() {
		this.aluguel = true;
		
	}
	void alugado() {
		this.aluguel = false;
	}
	
	

}
