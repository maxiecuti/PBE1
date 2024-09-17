package pjrExercicio01;

public class Carro {
	
	//Atributos

	String marca;
	String modelo;
	String placa;
	int anoFabricacao;
	
	//Construtores
	
	public Carro() {
		
	}
	public Carro(String Marca, String Modelo, String Placa, int Ano) {
		this.marca = Marca;
		this.modelo = Modelo;
		this.placa = Placa;
		this.anoFabricacao = Ano;
	}
	
	//Métodos 
	
	public void exibirInfo() {
	System.out.println("Marca: " + this.marca);
	System.out.println("Modelo: " + this.modelo);
	System.out.println("Placa: " + this.placa);
	System.out.println("Ano de fabricação: " + this.anoFabricacao);
		
	}
}
