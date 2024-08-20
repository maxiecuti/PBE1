package pjBancario;

public class Livro {
	
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true; 
    }

    // Getters e Setters
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Empréstimo realizado!");
        } else {
            System.out.println("O livro não está disponível.");
        }
    }

  
    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido!");
    }

 
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
   
        Livro livro = new Livro("Dracula", "Bram Stoker", 1897);
        livro.exibirInformacoes();
        livro.emprestar();
        livro.exibirInformacoes();
        livro.devolver();
        livro.exibirInformacoes();
    }
}