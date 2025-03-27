package exe1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float N1, N2, N3, N4, diferenca;

		System.out.println("Digite um número: ");
		N1 = ler.nextFloat();

		System.out.println("Digite um segundo número: ");
		N2 = ler.nextFloat();

		System.out.println("Digite um terceiro numero: ");
		N3 = ler.nextFloat();

		System.out.println("Digite um quarto número: ");
		N4 = ler.nextFloat();

		diferenca = (N1 * N2) - (N3 * N4);

		System.out.printf("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: = %.1f\n",
				diferenca);
		ler.close();
	}

}
