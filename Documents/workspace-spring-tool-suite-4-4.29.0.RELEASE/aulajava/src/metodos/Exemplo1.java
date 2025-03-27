package metodos;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		int resultado, soma = 2, numero1, numero2;

		System.out.println("Digite o 1 números: ");
		numero1 = lerScanner.nextInt();

		System.out.println("Digite o 2 números: ");
		numero2 = lerScanner.nextInt();

		resultado = Calculos.somar(numero1, numero2);

		soma = soma + resultado;

		Calculos.dividir(numero1, numero2);
		System.out.println("Resultado da soma: " + resultado);
		System.out.println("Resultado da soma: " + soma);
		
		lerScanner.close();
	}
}
