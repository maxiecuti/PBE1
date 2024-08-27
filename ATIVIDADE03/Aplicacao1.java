package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClasseAnimais elefante = new ClasseAnimais();
		
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		ClasseAnimais girafa = new ClasseAnimais("Melman", "Masai", "Macho", 750);
		
        SubclasseCarnivora Leão = new SubclasseCarnivora();
		
		elefante.atributoNome = "Nala";
		elefante.atributoRaca = "Africana";
		elefante.atributoSexo = "Fêmea";
		elefante.atributoPeso = 130;
		
		elefante.exibirInfo();
		
		elefante.metodoComer();
		
		elefante.exibirInfo();
		
		girafa.exibirInfo();

	}

}
