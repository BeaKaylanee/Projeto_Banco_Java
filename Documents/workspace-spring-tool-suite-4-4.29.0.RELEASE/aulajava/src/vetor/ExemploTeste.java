package vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploTeste {

	public static void main(String[] args) {
		Scanner lerScannner = new Scanner(System.in);

		int vet[] = new int[3];
		int total = 0;
		ArrayList<Integer> numerosPares = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Informe um número:");
			vet[i] = lerScannner.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			if (vet[i] % 2 == 0) {
				numerosPares.add(vet[i]);
				total += vet[i];
			}
		}

		System.out.println("\nNúmeros pares digitados: " + numerosPares);
		System.out.println("O total da soma dos números pares é: " + total);

		lerScannner.close();

	}
}
