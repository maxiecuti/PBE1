package prjExercicio02;

public class Aplicacao {

public static void main(String[] args) {
		
		Livro crepusculo = new Livro();
		
		crepusculo.titulo = "Crépusculo";
		crepusculo.autor = " Stephenie Meyer";
		crepusculo.numPaginas = 480;
		crepusculo.preco = 37.90;
		
		Livro bill = new Livro();
		
		bill.titulo = "O livro do Bill";
		bill.autor = "Alexander Robert";
		bill.numPaginas = 208;
		bill.preco = 138.17;
		
        Livro dracula = new Livro();
		
        dracula.titulo = "Drácula";
        dracula.autor = "Bram Stoker";
        dracula.numPaginas = 418;
        dracula.preco = 23.16;
		
		
		crepusculo.exibirInfo();
		crepusculo.aplicarDesconto();
		
		bill.exibirInfo();
		bill.aplicarDesconto();
		
		dracula.exibirInfo();
		dracula.aplicarDesconto();
		
 }
}