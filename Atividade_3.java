package pogramacao_backend;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o número do funcionário? ");
		int numero = sc.nextInt();
		
		System.out.println("Qual seu número de horas trabalhadas? ");
		int hora = sc.nextInt();
		
		System.out.println("E quanto recebe por hora: ");
		int recebe = sc.nextInt();
		
		System.out.printf("O seu número é :" + numero + " e o salário é de: " + hora*recebe + ".00");
		
	}

}
