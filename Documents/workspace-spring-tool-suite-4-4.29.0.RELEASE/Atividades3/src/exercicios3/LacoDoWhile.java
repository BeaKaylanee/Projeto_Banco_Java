package exercicios3;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		Scanner lerScannner = new Scanner(System.in);
		double soma = 0;
		double numero;

		do {
			System.out.print("Digite um número ou (0 para encerrar): ");
			 numero = lerScannner.nextDouble();

			if (numero > 0) {
				soma += numero; 
			}

		} while (numero != 0); 

		lerScannner.close();
		System.out.println("A soma dos números positivos digitados é: " + soma);
	}
}
