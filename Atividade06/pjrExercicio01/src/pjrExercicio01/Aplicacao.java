package pjrExercicio01;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Carro uno = new Carro();
		
		uno.marca = "Fiat";
		uno.modelo = "Uno";
		uno.placa = "EWO-6669";
		uno.anoFabricacao =  1984;
		
		Carro hb20 = new Carro();
		
		hb20.marca = "Hb20";
		hb20.modelo = "Hyundai";
		hb20.placa = "CUZ-2407";
		hb20.anoFabricacao = 2012;
		
		uno.exibirInfo();
		
		hb20.exibirInfo();
		
			
		

 }
}