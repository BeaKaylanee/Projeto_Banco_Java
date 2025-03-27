package exe1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiq;

		System.out.println("Informe o valor do seu salário bruto: ");
		salarioBruto = ler.nextFloat();

		System.out.println("Informe a quantidade de horas extras: ");
		horasExtras = ler.nextFloat();

		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = ler.nextFloat();

		System.out.println("Informe o valor dos descontos: ");
		descontos = ler.nextFloat();

		salarioLiq = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("O valor do seu salário líquido é: " + salarioLiq);

		ler.close();

	}

}
