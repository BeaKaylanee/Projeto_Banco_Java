package exercicios3;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lerScannner = new Scanner(System.in);
		int pares = 0, impares = 0;

		for (int count = 1; count <= 10; count++) {
			System.out.print("Digite o " + count + "º número: ");
			int numero = lerScannner.nextInt();
			if (numero % 2 == 0)
				pares++;
			else
				impares++;
		}

		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);

		lerScannner.close();
	}
}
