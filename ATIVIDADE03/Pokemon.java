package prjPokemon;

public class Pokemon {
	
	//Atributos
    String Nome;
    String Elemento;
	int Evolucao;
	int Hp;
	
	//Construtores
	
	 public Pokemon() {
		 
		}
	 public Pokemon(String Nome, String Elemento, int Evolucao, int Hp) {
	 this.Nome = Nome;
	 this.Elemento = Elemento;
	 this.Evolucao = Evolucao;
	 this.Hp = Hp;
			  
	 }
	 //Metodos
	 public void ataque() {
			  System.out.println(this.Nome + " Ele atacou!");
	 }			  
	 public void Evoluir() {
		 if (this.Evolucao >= 3) {
		 System.out.println(this.Nome + " Ele evoluiu de nivel!");
		 }
		 else {
		 this.Evolucao = 3; 
		 System.out.println(this.Nome + " Ele está no nível maximo!");
		 }
	 }
	 public void Exibir() {
		 System.out.println("Nome: " + this.Nome);
		 System.out.println("Elemento: " + this.Elemento);
		 System.out.println("Evolução: " + this.Evolucao);
		 System.out.println("Hp: " + this.Hp);
	 }
	public static void main(String[] args) {
	
	}

}
