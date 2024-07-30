package pogramacao_backend;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
				
		System.out.println("Digite o raio do círculo: ");
		int raio = sc.nextInt();
		
		System.out.println("A área deste círculo é de: " + pi*raio*raio);
		
	}

}
