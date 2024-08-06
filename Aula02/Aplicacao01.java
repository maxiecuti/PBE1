package prjCaneta;

import java.util.Scanner;

public class Aplicacao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Caneta caneta01 = new Caneta();
		caneta01.modelo = "Bic";
		caneta01.cor = "azul";
		caneta01.ponta = 0.5;
		caneta01.tampada = false;
		
		Caneta caneta02 = new Caneta();
		caneta02.modelo = "Faber castel";
		caneta02.cor = "verde";
		caneta02.ponta = 1.0;
		caneta02.tampada = true;
		
		caneta01.status();
		
		System.out.println("Qual a carga da sua caneta 01?");
		caneta01.carga = sc.nextInt();
		
		System.out.println("Qual a carga da sua caneta 02?");
		caneta02.carga = sc.nextInt();
		
		caneta01.status();
		caneta02.status();
		
		
	}

}
