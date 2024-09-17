package prjExercicio02;

public class Livro {
	
	//Atributos

    String titulo;
	String autor;
	int numPaginas;
	double preco;
		
	//Construtores
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, double preco, int numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.numPaginas = numPaginas;
	}
	
	//Getters e Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	   //Métodos
	
	    public void aplicarDesconto() {
		this.preco -= 15;
		System.out.println(this.preco + " com desconto!");
	
		}
		
		public void exibirInfo() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Número de páginas: " + this.numPaginas);
		System.out.println("Preço: " + this.preco);
				

	 }	

}
